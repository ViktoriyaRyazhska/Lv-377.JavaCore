package Lesson4_Conditions.Task2;

public enum Localization {

	// Enter the number of the day of the week. Display the name in three languages.

	MON("Monday", "��������", "Poniedzialek"), 
	TUE("Tuesday", "³������", "Wtorek"), 
	WED("Wednesday", "������", "Sroda"), 
	THU("Thursday", "������", "Czwartek"), 
	FRI("Friday", "�'������", "Piatek"), 
	SAT("Saturday", "������", "Sobota"), 
	SUN("Sunday", "�����", "Niedziela");

	private final String en;
	private final String ua;
	private final String pl;

	Localization(String en, String ua, String pl) {
		this.en = en;
		this.ua = ua;
		this.pl = pl;
	}

	public String getEn() {
		return en;
	}

	public String getUa() {
		return ua;
	}

	public String getPl() {
		return pl;
	}

}
