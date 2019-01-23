package Lesson4_Conditions.Task2;

public enum Localization {

	// Enter the number of the day of the week. Display the name in three languages.

	MON("Monday", "Понеділок", "Poniedzialek"), 
	TUE("Tuesday", "Вівторок", "Wtorek"), 
	WED("Wednesday", "Середа", "Sroda"), 
	THU("Thursday", "Четвер", "Czwartek"), 
	FRI("Friday", "П'ятниця", "Piatek"), 
	SAT("Saturday", "Субота", "Sobota"), 
	SUN("Sunday", "Неділя", "Niedziela");

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
