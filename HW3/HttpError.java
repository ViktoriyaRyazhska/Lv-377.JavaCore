
public enum HttpError {
	Error400 {
		public String getDescription() {return "Bad Request — Неправильний запит.";}
		},
	Error401{
		public String getDescription() {return "Unauthorized — Несанкціонований доступ.";}
		},
	Error402{
		public String getDescription() {return "Payment Required — Потрібна оплата.";}
		},
	Error403{
		public String getDescription() {return "Forbidden — Заборонено.";}
		},
	Error404{
		public String getDescription() {return "Not Found — Не знайдено.";}
		};
	
	public abstract String getDescription();
	
	public void showAllDescriptions() {
		for (HttpError err: HttpError.values()) {
			System.out.println(err.name() + " : " + err.getDescription());
		}
	}
}