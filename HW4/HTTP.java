package HW4;

//public enum HTTP {
//	H400, H401, H402, H403;
	
	public enum HTTP {
		BadRequest {
		   public HTTP errorHTTP() { return BadRequest; }
		},
		Unauthorized {
		   public HTTP errorHTTP() { return Unauthorized; }
		},
		PaymentRequired {
		   public HTTP errorHTTP() { return PaymentRequired; }
		},
		Forbidden {
		   public HTTP errorHTTP() { return Forbidden; }
		};
		public abstract HTTP errorHTTP();
	}
//	public enum HTTP {
//		H400 {
//		   public HTTP errorHTTP() { System.out.println("Bad Request");
//		return null; }
//		},
//		H401 {
//		   public HTTP errorHTTP() { System.out.println("Unauthorized");
//		return null; }
//		},
//		H402 {
//		   public HTTP errorHTTP() { System.out.println("Payment Required");
//		return null; }
//		},
//		H403 {
//		   public HTTP errorHTTP() { System.out.println("Forbidden");
//		return null; }
//		};
//
//		public abstract errorHTTP();
//	}
//	public HTTP errorHTTP() {
//		if (this == HTTP.H400) System.out.println("Bad Request");
//		if (this == HTTP.H401) System.out.println("Unauthorized");
//		if (this == HTTP.H402) System.out.println("Payment Required");
//		return HTTP.H403;
//	}
//}