import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public enum Errortype {
	BadRequest, Unauthorized, PaymentRequired, Forbidden, NotFound, MethodNotAllowed, WrongRequest;
	
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter error code");
		int code = Integer.parseInt(br.readLine());
		
	Errortype errortype;

	switch (code) {
	case 400: 
	errortype = Errortype.BadRequest;
	break;
	case 401: 
		errortype = Errortype.Unauthorized;
		break;
	case 402: 
		errortype = Errortype.PaymentRequired;
		break;
	case 403: 
		errortype = Errortype.Forbidden;
		break;
	case 404: 
		errortype = Errortype.NotFound;
		break;
	case 405: 
		errortype = Errortype.MethodNotAllowed;
		break;
		
	default: errortype = Errortype.WrongRequest;
	}
	
	System.out.println("Code " + code + " is " + "'" + errortype +  "'" );
	}
}
