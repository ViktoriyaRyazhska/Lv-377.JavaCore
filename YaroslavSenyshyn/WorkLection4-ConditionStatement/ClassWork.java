package day3;

public class ClassWork {
	
	public int addNumber(int x, int y, int z) {
		int result=0;
		if (x/2 == 0) {
			result++;
		}
		if (y/2 == 0) {
			result++;
		}
		if (z/2 == 0) {
			result++;
		}
		return result;
	}
	public void Week(int x) {

		switch (x) {
		case 1 : System.out.println("Monday, 111, 111");break;
		case 2 : System.out.println("Tuesday, 222, 222");break;
		case 3 : System.out.println("Wednesday, 333, 333");break;
		case 4 : System.out.println("Thursday, 444, 444");break;
		case 5 : System.out.println("Friday, 555, 555");break;
		case 6 : System.out.println("Satyrday, 666, 666");break;
		case 7 : System.out.println("Sunday, 777, 777");break;
		default : System.out.println("Wrong number!");break;
		}
	}
	
	public enum Continent {
		Europe, Africa, Azia, America;
	}
	public Continent countryContinent (String country) {
			
			if (country.equals("Ukraine") || country.equals("Italy")) {
				return  Continent.Europe;
			}
			if (country.equals("Egypt") || country.equals("Tunis")) {
				return  Continent.Africa;
			}
			if (country.equals("India") || country.equals("China")) {
				return  Continent.Azia;
			}
			if (country.equals("Brasilia") || country.equals("Peru")) {
				return  Continent.America;
			}
			
			return Continent.Europe;
		}

}

