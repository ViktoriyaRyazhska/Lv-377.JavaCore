package Lesson4_Conditions.Task1;

public enum AllContinents {

	// Enter the name of the country. Print the name of the continent.
	// (Declare enum with names of continents)

	ASIA("China", "Asia"), 
	AFRICA("Tunis", "Africa"), 
	EUROPE("The Netherlands", "Europe"), 
	NORTHAMERICA("USA", "North America"), 
	SOUTHAMERICA("Peru", "South America"), 
	AUSTRALIA("Australia", "Australia"), 
	ANTARCTICA("Antarctica", "Antarctica");

	String country;
	String continentName;

	private AllContinents(String country, String continentName) {
		this.continentName = continentName;
		this.country = country;
	}

	public String getContinentName() {
		return continentName;
	}

	public String getCountry() {
		return country;
	}

}
