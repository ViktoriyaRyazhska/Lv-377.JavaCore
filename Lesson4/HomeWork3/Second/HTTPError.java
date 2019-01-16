package SoftServe.Lesson4.HomeWork3.Second;

public enum HTTPError {
    E400("Bad Request"), E401("Unauthorized"), E402("Payment Required"), E403("Forbidden"), E404("Not Found"),
    E405("Method Not Allowed"), E406("Not Acceptable"), E407("Proxy Authentication Required"), E408("Request Timeout"),
    E409("Conflict"), E410("Gone"), E411("Length Required"), E412("Precondition Failed"), E413("Request Entity Too Large"),
    E414("Request-URI Too Long"), E415("Unsupported Media Type"), E416("Requested Range Not Satisfiable"),
    E417("Expectation Failed"), E418("I'm a teapot"), E419("Authentication Timeout"), E420("Method Failure"),
    E422("Unprocessable Entity"), E423("Locked "), E424("Failed Dependency"), E426("Upgrade Required"),
    E428("Precondition Required"), E429("Too Many Requests"), E431("Request Header Fields Too Large"),
    E440("Login Timeout"), E444("No Response"), E449("Retry With"), E450("Blocked by Windows Parental Controls"),
    E451("Unavailable For Legal Reasons or Redirect (Microsoft)"), E494("Request Header Too Large"),
    E495("Cert Error"), E496("No Cert"), E497("HTTP to HTTPS"), E498("Token expired/invalid"), E499("Client Closed Request");

    private final String ErrorName;

    HTTPError(String ErrorName) {
        this.ErrorName = ErrorName;
    }

    public String getErrorName() {
        return ErrorName;
    }
}
