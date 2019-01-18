package hw4.softserve;

	public enum Error {
		HTTP400("Bad Request"), 
		HTTP401("Unauthorized"),
		HTTP402("Payment Required");
		 


		private final String err;

		Error(String err) {
			this.err = err;
		}

		public String getError() {
			return err;
		}
	}

