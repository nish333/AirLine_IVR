package flow;

/**
 * This servlet is used to forward the request to the entry point of a
 * project callflow (subflow).
 * Last generated by Orchestration Designer at: 2024-JUL-26  11:52:05 AM
 */
public class MaxReachLogic extends com.avaya.sce.runtime.Subflow {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2024-JUL-26  11:52:05 AM
	 */
	public MaxReachLogic() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the name of the subflow that is being invoked.  This name is used for
	 * determining the URL mapping for the the entry point of the subflow..
	 *
	 * @return the name of the subflow
	 * Last generated by Orchestration Designer at: 2024-JUL-31  05:04:32 PM
	 */
	protected String getSubflowName() {
		return("Maxreach");
	}
	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
	 * Last generated by Orchestration Designer at: 2024-JUL-31  05:04:32 PM
	 */
	protected java.util.Map<String,String> getExitPoints() {
		java.util.Map<String, String> exitPoints;
		exitPoints = new java.util.HashMap<String, String>();
		exitPoints.put("Maxreach-RETURN", "MainMenu");
		exitPoints.put("Maxreach-EXIT", "ThanksPrompt");
		return exitPoints;
	}
}
