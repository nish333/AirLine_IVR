package flow;

/**
 * This interface is used to define the name of variables that are 
 * declared in the call flow.  All variables are defined as 
 * <code>public static final String</code>, which allows user-defined
 * code to reference variable names by the Java variable name.
 * Last generated by Orchestration Designer at: 2024-JUL-02  04:08:23 PM
 */
public interface IProjectVariables {





	//{{START:PROJECT:VARIABLES
	/**
	 * This is a reserved block of variable name definitions.
	 * The variable names defined here can be used as the key
	 * to get the <code>com.avaya.sce.runtime.Variable</code>
	 * from the <code>SCESession</code> at runtime.<br>
	 * 
	 * For example, given a variable name <code>phoneNum</code>,
	 * user-defined code should access the variable in this format:<PRE>
	 *   Variable phNum = mySession.getVariable(IProjectVariables.PHONE_NUM);
	 *   if ( phNum != null ) {
	 *        // do something with the variable
	 *   }</PRE>
	 * 
	 * This block of code is generated automatically by Orchestration Designer and should not
	 * be manually edited as changes may be overwritten by future code generation.
	 * Last generated by Orchestration Designer at: 2024-JUL-31  05:04:32 PM
	 */
	public static final String MILLISECONDS = "milliseconds";
	public static final String REASON = "reason";
	public static final String YEAR = "year";
	public static final String TEST_BOOKING_ID = "TestBookingId";
	public static final String COUNT = "Count";
	public static final String SECONDS = "seconds";
	public static final String UCID = "ucid";
	public static final String NODE = "node";
	public static final String PROMPTTOPLAY = "prompttoplay";
	public static final String EXISTING_MAIN_MENU = "ExistingMainMenu";
	public static final String REDIRECTINFO = "redirectinfo";
	public static final String STATUS = "status";
	public static final String STATUSSS = "statusss";
	public static final String AGENT_TRANSFER = "AgentTransfer";
	public static final String CALLERID = "callerid";
	public static final String CALLERSTATUS = "callerstatus";
	public static final String BOOKING_ID_TIME = "BookingIdTime";
	public static final String DATE = "date";
	public static final String IDCHECKING = "IDChecking";
	public static final String LASTRESULT = "lastresult";
	public static final String DEPARTUREDATE = "departuredate";
	public static final String LANGUAGE = "language";
	public static final String MAIN_MENU = "MainMenu";
	public static final String BOOKING_ID = "BookingId";
	public static final String DDEPARTUREDDATE = "ddepartureddate";
	public static final String MINUTES = "minutes";
	public static final String BOOKINGDATE = "bookingdate";
	public static final String MONTH = "month";
	public static final String CUSTOMERID = "customerid";
	public static final String PREPAREAAI = "prepareaai";
	public static final String SESSION = "session";
	public static final String BOOKINGSTATUS = "bookingstatus";
	public static final String BLINDTRANSFER = "blindtransfer";
	public static final String DATEE = "datee";
	public static final String UNIQUEID = "uniqueid";
	public static final String CALLDETAILS = "calldetails";
	public static final String HOURS = "hours";
	public static final String TESTBOOKID = "Testbookid";
	public static final String USER_INPUT = "UserInput";
	public static final String DD_LAST_EXCEPTION = "ddLastException";
	public static final String PNRNUMBER = "pnrnumber";
	public static final String GET_BOOKING_ID = "GetBookingID";
	public static final String DEPARTURETIME = "departuretime";
	public static final String CALLTIME = "calltime";
	public static final String TIME = "time";
	public static final String PROPERTIES = "properties";
	public static final String SHAREDUUI = "shareduui";
	//}}END:PROJECT:VARIABLES
	//{{START:PROJECT:VARIABLEFIELDS
	public static final String REASON_FIELD_DISCONNECTREASON = "disconnectreason";
	public static final String TEST_BOOKING_ID_FIELD_CONFIDENCE = "confidence";
	public static final String TEST_BOOKING_ID_FIELD_INPUTMODE = "inputmode";
	public static final String TEST_BOOKING_ID_FIELD_INTERPRETATION = "interpretation";
	public static final String TEST_BOOKING_ID_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String TEST_BOOKING_ID_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String TEST_BOOKING_ID_FIELD_UTTERANCE = "utterance";
	public static final String TEST_BOOKING_ID_FIELD_VALUE = "value";
	public static final String NODE_FIELD_EXITNODE = "exitnode";
	public static final String EXISTING_MAIN_MENU_FIELD_CONFIDENCE = "confidence";
	public static final String EXISTING_MAIN_MENU_FIELD_INPUTMODE = "inputmode";
	public static final String EXISTING_MAIN_MENU_FIELD_INTERPRETATION = "interpretation";
	public static final String EXISTING_MAIN_MENU_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String EXISTING_MAIN_MENU_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String EXISTING_MAIN_MENU_FIELD_UTTERANCE = "utterance";
	public static final String EXISTING_MAIN_MENU_FIELD_VALUE = "value";
	public static final String REDIRECTINFO_FIELD_PRESENTATIONINFO = "presentationinfo";
	public static final String REDIRECTINFO_FIELD_REASON = "reason";
	public static final String REDIRECTINFO_FIELD_SCREENINGINFO = "screeninginfo";
	public static final String REDIRECTINFO_FIELD_URI = "uri";
	public static final String BOOKING_ID_TIME_FIELD_CONFIDENCE = "confidence";
	public static final String BOOKING_ID_TIME_FIELD_INPUTMODE = "inputmode";
	public static final String BOOKING_ID_TIME_FIELD_INTERPRETATION = "interpretation";
	public static final String BOOKING_ID_TIME_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String BOOKING_ID_TIME_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String BOOKING_ID_TIME_FIELD_UTTERANCE = "utterance";
	public static final String BOOKING_ID_TIME_FIELD_VALUE = "value";
	public static final String DATE_FIELD_AUDIO = "audio";
	public static final String DATE_FIELD_DAYOFMONTH = "dayofmonth";
	public static final String DATE_FIELD_DAYOFWEEK = "dayofweek";
	public static final String DATE_FIELD_DAYOFWEEKNUM = "dayofweeknum";
	public static final String DATE_FIELD_DAYOFYEAR = "dayofyear";
	public static final String DATE_FIELD_MONTH = "month";
	public static final String DATE_FIELD_MONTHINYEAR = "monthinyear";
	public static final String DATE_FIELD_YEAR = "year";
	public static final String IDCHECKING_FIELD_CONFIDENCE = "confidence";
	public static final String IDCHECKING_FIELD_INPUTMODE = "inputmode";
	public static final String IDCHECKING_FIELD_INTERPRETATION = "interpretation";
	public static final String IDCHECKING_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String IDCHECKING_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String IDCHECKING_FIELD_UTTERANCE = "utterance";
	public static final String IDCHECKING_FIELD_VALUE = "value";
	public static final String MAIN_MENU_FIELD_CONFIDENCE = "confidence";
	public static final String MAIN_MENU_FIELD_INPUTMODE = "inputmode";
	public static final String MAIN_MENU_FIELD_INTERPRETATION = "interpretation";
	public static final String MAIN_MENU_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String MAIN_MENU_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String MAIN_MENU_FIELD_UTTERANCE = "utterance";
	public static final String MAIN_MENU_FIELD_VALUE = "value";
	public static final String BOOKING_ID_FIELD_CONFIDENCE = "confidence";
	public static final String BOOKING_ID_FIELD_INPUTMODE = "inputmode";
	public static final String BOOKING_ID_FIELD_INTERPRETATION = "interpretation";
	public static final String BOOKING_ID_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String BOOKING_ID_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String BOOKING_ID_FIELD_UTTERANCE = "utterance";
	public static final String BOOKING_ID_FIELD_VALUE = "value";
	public static final String SESSION_FIELD_AAI = "aai";
	public static final String SESSION_FIELD_ANI = "ani";
	public static final String SESSION_FIELD_CALLTAG = "calltag";
	public static final String SESSION_FIELD_CHANNEL = "channel";
	public static final String SESSION_FIELD_CHANNELTYPE = "channeltype";
	public static final String SESSION_FIELD_CONVERSEFIRST = "conversefirst";
	public static final String SESSION_FIELD_CONVERSESECOND = "conversesecond";
	public static final String SESSION_FIELD_CURRENTLANGUAGE = "currentlanguage";
	public static final String SESSION_FIELD_DNIS = "dnis";
	public static final String SESSION_FIELD_EXIT_CUSTOMER_ID = "exitCustomerId";
	public static final String SESSION_FIELD_EXIT_INFO_1 = "exitInfo1";
	public static final String SESSION_FIELD_EXIT_INFO_2 = "exitInfo2";
	public static final String SESSION_FIELD_EXIT_PARENT_ID = "exitParentId";
	public static final String SESSION_FIELD_EXIT_PREFERRED_PATH = "exitPreferredPath";
	public static final String SESSION_FIELD_EXIT_REASON = "exitReason";
	public static final String SESSION_FIELD_EXIT_TOPIC = "exitTopic";
	public static final String SESSION_FIELD_LASTERROR = "lasterror";
	public static final String SESSION_FIELD_MEDIATYPE = "mediatype";
	public static final String SESSION_FIELD_PROTOCOLNAME = "protocolname";
	public static final String SESSION_FIELD_PROTOCOLVERSION = "protocolversion";
	public static final String SESSION_FIELD_SESSIONID = "sessionid";
	public static final String SESSION_FIELD_SESSIONLABEL = "sessionlabel";
	public static final String SESSION_FIELD_SHAREDMODE = "sharedmode";
	public static final String SESSION_FIELD_UCID = "ucid";
	public static final String SESSION_FIELD_UUI = "uui";
	public static final String SESSION_FIELD_VIDEOBITRATE = "videobitrate";
	public static final String SESSION_FIELD_VIDEOCODEC = "videocodec";
	public static final String SESSION_FIELD_VIDEOENABLED = "videoenabled";
	public static final String SESSION_FIELD_VIDEOFARFMTP = "videofarfmtp";
	public static final String SESSION_FIELD_VIDEOFORMAT = "videoformat";
	public static final String SESSION_FIELD_VIDEOFPS = "videofps";
	public static final String SESSION_FIELD_VIDEOHEIGHT = "videoheight";
	public static final String SESSION_FIELD_VIDEONEARFMTP = "videonearfmtp";
	public static final String SESSION_FIELD_VIDEOWIDTH = "videowidth";
	public static final String SESSION_FIELD_VPCALLEDEXTENSION = "vpcalledextension";
	public static final String SESSION_FIELD_VPCONVERSEONDATA = "vpconverseondata";
	public static final String SESSION_FIELD_VPCOVERAGEREASON = "vpcoveragereason";
	public static final String SESSION_FIELD_VPCOVERAGETYPE = "vpcoveragetype";
	public static final String SESSION_FIELD_VPRDNIS = "vprdnis";
	public static final String SESSION_FIELD_VPREPORTURL = "vpreporturl";
	public static final String CALLDETAILS_FIELD_ENDTIME = "endtime";
	public static final String CALLDETAILS_FIELD_STARTIME = "startime";
	public static final String CALLDETAILS_FIELD_VDN = "vdn";
	public static final String TESTBOOKID_FIELD_CONFIDENCE = "confidence";
	public static final String TESTBOOKID_FIELD_INPUTMODE = "inputmode";
	public static final String TESTBOOKID_FIELD_INTERPRETATION = "interpretation";
	public static final String TESTBOOKID_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String TESTBOOKID_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String TESTBOOKID_FIELD_UTTERANCE = "utterance";
	public static final String TESTBOOKID_FIELD_VALUE = "value";
	public static final String DD_LAST_EXCEPTION_FIELD_ERRORCODE = "errorcode";
	public static final String DD_LAST_EXCEPTION_FIELD_MESSAGE = "message";
	public static final String DD_LAST_EXCEPTION_FIELD_OBJECT = "object";
	public static final String DD_LAST_EXCEPTION_FIELD_STACKTRACE = "stacktrace";
	public static final String DD_LAST_EXCEPTION_FIELD_TYPE = "type";
	public static final String GET_BOOKING_ID_FIELD_CONFIDENCE = "confidence";
	public static final String GET_BOOKING_ID_FIELD_INPUTMODE = "inputmode";
	public static final String GET_BOOKING_ID_FIELD_INTERPRETATION = "interpretation";
	public static final String GET_BOOKING_ID_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String GET_BOOKING_ID_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String GET_BOOKING_ID_FIELD_UTTERANCE = "utterance";
	public static final String GET_BOOKING_ID_FIELD_VALUE = "value";
	public static final String CALLTIME_FIELD_DURATION = "duration";
	public static final String CALLTIME_FIELD_ENDTIME = "endtime";
	public static final String CALLTIME_FIELD_STARTTIME = "starttime";
	public static final String TIME_FIELD_AUDIO = "audio";
	public static final String TIME_FIELD_HOUR = "hour";
	public static final String TIME_FIELD_MILLISECOND = "millisecond";
	public static final String TIME_FIELD_MINUTE = "minute";
	public static final String TIME_FIELD_SECOND = "second";
	public static final String TIME_FIELD_TIMEZONE = "timezone";
	public static final String PROPERTIES_FIELD_AUDIOLOCATION = "audiolocation";
	public static final String PROPERTIES_FIELD_DBPASSWORD = "dbpassword";
	public static final String PROPERTIES_FIELD_DBURL = "dburl";
	public static final String PROPERTIES_FIELD_DBUSER = "dbuser";
	public static final String PROPERTIES_FIELD_RETRYCOUNT = "retrycount";
	public static final String PROPERTIES_FIELD_TRANSFERVDN_1 = "transfervdn1";
	public static final String PROPERTIES_FIELD_TRANSFERVDN_2 = "transfervdn2";
	public static final String PROPERTIES_FIELD_TRANSFERVDN_3 = "transfervdn3";
	public static final String SHAREDUUI_FIELD_ID = "id";
	public static final String SHAREDUUI_FIELD_VALUE = "value";
	//}}END:PROJECT:VARIABLEFIELDS
	public static final String SESSION_FIELD_LANGUAGE = "English";
	public static final String USER_EXISTENCE_RESULT = null;
}
