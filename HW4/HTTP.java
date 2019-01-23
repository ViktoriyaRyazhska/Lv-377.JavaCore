package HW4;

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