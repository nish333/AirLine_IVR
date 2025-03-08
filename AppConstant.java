package beans;

public class AppConstant 
{	
	public static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public static final String callhistoryinsert = "{call SP_AIRLINE_CALLHISTORY_INSERT(?)}";
	public static final String bookingid = "{call SP_AIRLINE_Get_Booking_Id(?)}";  
	public static final String departureTime = "{call SP_AIRLINE_Get_Departure_Date(?)}";
	public static final String checkexistinguser = "{call SP_AIRLINE_Get_Caller_Number(?)}";
	public static final String insertuser = "{call SP_AIRLINE_CUSTOMER_INSERT(?, ?)}";
	public static final String datetimeformat = "yyyy-MM-dd HH:mm:ss";
	public static final String overallcallinsert = "{CALL SP_AIRLINE_CALLHISTORY_INSERT(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
	public static final String language = "English";
	public static final String hangup= "Hangup";
	public static final String disconnect= "Disconnect";
	public static final String pnrdetails = "{CALL SP_AIRLINE_PNR_DETAILS(?)}" ;
	public static final String nuid = "NU_ID";
	public static final String customerid = "VC_CUSTOMER_ID";
	public static final String bookingstatus = "VC_BOOKING_STATUS";
	public static final String pnrnumber = "VC_PNR_NUMBER";
	public static final String bookid = "DT_BOOKING_DATE";
	public static final String departureid = "DT_DEPATURE_DATE";
	public static final String status = "VC_BOOKING_STATUS";
	public static final String url = "db.url";
	public static final String username = "db.user";
	public static final String password = "db.password";
	public static final String dateformat = "yyyy-MM-dd HH:mm:ss";
	public static final String yearformat = "yyyy-MM-dd";
}
