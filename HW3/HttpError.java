
public enum HttpError {
	Error400 {
		public String getDescription() {return "Bad Request � ������������ �����.";}
		},
	Error401{
		public String getDescription() {return "Unauthorized � ���������������� ������.";}
		},
	Error402{
		public String getDescription() {return "Payment Required � ������� ������.";}
		},
	Error403{
		public String getDescription() {return "Forbidden � ����������.";}
		},
	Error404{
		public String getDescription() {return "Not Found � �� ��������.";}
		};
	
	public abstract String getDescription();
	
	public void showAllDescriptions() {
		for (HttpError err: HttpError.values()) {
			System.out.println(err.name() + " : " + err.getDescription());
		}
	}
}