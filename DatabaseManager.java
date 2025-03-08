package beans;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletContext;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;

public class DatabaseManager {
    private Properties properties;
    private String propertiesFilePath;
    private long lastModifiedTime;
    private Connection connection;

    public DatabaseManager(SCESession mySession) {
        loadPropertiesFilePath(mySession);
        if (isPropertiesFileAvailable(mySession)) {
            loadPropertiesIfModified(mySession);
            connectToDatabase(mySession);
        }
    }

    private void loadPropertiesFilePath(SCESession mySession) {
        try {
            ServletContext context = mySession.getServlet().getServletContext();
            propertiesFilePath = context.getInitParameter("PROPERTIES_FILE");
            if (propertiesFilePath == null || propertiesFilePath.isEmpty()) {
                TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Properties file path is not defined in web.xml", mySession);
            }
        } catch (Exception e) {
            TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Error accessing ServletContext: " + e.getMessage(), mySession);
        }
    }

    private boolean isPropertiesFileAvailable(SCESession mySession) {
        if (propertiesFilePath == null || propertiesFilePath.isEmpty()) {
            TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Properties file path is not set.", mySession);
            return false;
        }

        Path path = Paths.get(propertiesFilePath);
        if (!Files.exists(path)) {
            TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Properties file does not exist at path: " + propertiesFilePath, mySession);
            return false;
        }

        return true;
    }

    private synchronized void loadPropertiesIfModified(SCESession mySession) {
        Path path = Paths.get(propertiesFilePath);
        try {
            long currentModifiedTime = Files.getLastModifiedTime(path).toMillis();

            if (properties == null || currentModifiedTime > lastModifiedTime) {
                properties = new Properties();
                try (FileInputStream input = new FileInputStream(propertiesFilePath)) {
                    properties.load(input);
                    lastModifiedTime = currentModifiedTime;
                    TraceInfo.trace(ITraceInfo.TRACE_LEVEL_DEBUG, "Properties file loaded successfully.", mySession);
                } catch (IOException e) {
                    TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "IOException: " + e.getMessage(), mySession);
                }
            }
        } catch (IOException e) {
            TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "IOException when checking properties file last modified time: " + e.getMessage(), mySession);
        }
    }

    private void connectToDatabase(SCESession mySession) {
        if (properties == null) {
            TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Properties are not loaded.", mySession);
            return;
        }

        String url = properties.getProperty("db.url");
        String user = properties.getProperty("db.user");
        String password = properties.getProperty("db.password");

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, password);
            TraceInfo.trace(ITraceInfo.TRACE_LEVEL_DEBUG, "Database connected successfully.", mySession);
        } catch (ClassNotFoundException e) {
            TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Database driver not found: " + e.getMessage(), mySession);
        } catch (SQLException e) {
            TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "SQL Exception: " + e.getMessage(), mySession);
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection(SCESession mySession) {
        if (connection != null) {
            try {
                connection.close();
                TraceInfo.trace(ITraceInfo.TRACE_LEVEL_DEBUG, "Database connection closed.", mySession);
            } catch (SQLException e) {
                TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Error closing database connection: " + e.getMessage(), mySession);
            }
        }
    }
}


