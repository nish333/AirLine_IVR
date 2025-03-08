
package flow;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;

import beans.AppConstant;
import beans.DatabaseManager;

/**
 * The Data class handles many types of server-side operations including data
 * collection (from a data sources such as a database, or web service), variable
 * assignments and operations (like copying variable values, performing mathematic
 * operations, and collection iteration), conditional evaluation to control callflow
 * execution based on variable values, and logging/tracing statements.
 * 
 * Items created in the getDataActions() method are executed/evaluated in order
 * and if a condional branch condition evaluates to "true" then the branch is
 * activated and the execution of data actions is halted.  If no "true" conditions
 * are encountered, then all data actions will be executed/evaluated and the 
 * application will proceed to the "Default" servlet.
 * Last generated by Orchestration Designer at: 2024-JUL-19  10:06:46 AM
 */
public class DB_Operation extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2024-JUL-19  10:06:46 AM
	 */
	public DB_Operation() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	
	@Override
	public void requestBegin(SCESession mySession) {
	    super.requestBegin(mySession);

	    DatabaseManager dbManager = new DatabaseManager(mySession);
	    Connection connection = null;
	    CallableStatement callableStatement = null;

	    try {
	       
	    	connection = dbManager.getConnection();
	        if (connection != null) {
	            TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Successfully Connected to the database.", mySession);

	            Date startTime = new Date();
	            SimpleDateFormat sdf = new SimpleDateFormat(AppConstant.datetimeformat);
	            mySession.getVariableField(IProjectVariables.CALLDETAILS, IProjectVariables.CALLDETAILS_FIELD_STARTIME).setValue(sdf.format(startTime));
	            TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Call start time: " + sdf.format(startTime), mySession);

	            String sql = AppConstant.callhistoryinsert;
	            callableStatement = connection.prepareCall(sql);
	            
	            TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Setting Start Time: " + new Timestamp(startTime.getTime()), mySession);
	            callableStatement.setTimestamp(1, new Timestamp(startTime.getTime())); 
	            callableStatement.execute();
	        } else {
	            TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Failed to connect to the database.", mySession);
	        }
	    } catch (SQLException e) {
	        TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "SQL Error while inserting call history into the database: " + e.getMessage(), mySession);
	    } finally {
	        try {
	            if (callableStatement != null) {
	                callableStatement.close();
	            }
	            if (connection != null) {
	            	connection.close();
	            }
	        } catch (SQLException e) {
	            TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Error while closing resources: " + e.getMessage(), mySession);
	        }
	    }
	}


	

	
	
	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 2024-JUL-31  05:04:32 PM
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = new com.avaya.sce.runtime.Next("CheckingUser", "Default");
		next.setDebugId(876);
		return next;
	}
	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2024-JUL-31  05:04:32 PM
	 */
	public java.util.Collection<VariableInfo> getLocalVariables(){
		java.util.Collection<VariableInfo> variables = new java.util.ArrayList<VariableInfo>();

		return variables;
	}
	/**
	 * Creates and conditionally executes operations that have been configured
	 * in the Callflow.  This method will build a collection of operations and
	 * have the framework execute the operations by calling evaluateActions().
	 * If the evaluation causes the framework to forward to a different servlet
	 * then execution stops.
	 * Returning true from this method means that the framework has forwarded the
	 * request to a different servlet.  Returning false means that the default
	 * Next will be invoked.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2024-JUL-31  05:04:32 PM
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(2);
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_DEBUG, "ENTER INTO DATABASE OPERATION", "").setDebugId(879));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}
