package Home_work_4_Conditions.Numbers;

public enum httpErrors {

	// read number of HTTP Error (400, 401,402, ...) and write the name of this
	// error (Declare enum HTTP Error)

	PAYMENT_REQUIRED(402, "Payment Required"), 
	FORBIDDEN(403, "Forbidden"), 
	NOT_FOUND(404, "Not Found"), 
	METHOD_NOT_ALLOWED(405, "Method Not Allowed"), 
	NOT_ACCEPTABLE(406, "Not Acceptable"), 
	PROXY_AUTHENTICATION_REQUIRED(407, "Proxy Authentication Required"), 
	REQUEST_TIMEOUT(408, "AlertsRequest Timeout"), 
	CONFLICT(409, "Conflict"), GONE(410, "Gone"), 
	LENGTH_REQUIRED(411, "Length Required"), 
	PRECONDITION_FAILED(412, "Precondition Failed"), 
	REQUEST_ENTITY_TOO_LARGE(413, "AlertsRequest Entity Too Large"), 
	REQUEST_URI_TOO_LONG(414, "AlertsRequest-URI Too Long"), 
	UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type"), 
	REQUESTED_RANGE_NOT_SATISFIABLE( 416, "Requested Range Not Satisfiable"), 
	EXPECTATION_FAILED(417, "Expectation Failed");

	int errorNumber;
	String errorExplanation;
	
	private httpErrors(int errorNumber, String errorExplanation) {
		this.errorNumber = errorNumber;
		this.errorExplanation = errorExplanation;
	}

	public int getErrorNumber() {
		return errorNumber;
	}

	public String getErrorExplanation() {
		return errorExplanation;
	}
	
}
