package day3;

public class ClassWorkMain {

	public static void main(String[] args) {
/////////////		
		ClassWork p1 = new ClassWork();
		System.out.println(p1.addNumber(2, 1, 4));
/////////////
		ClassWork day = new ClassWork();
		day.Week(3);
////////////		
		ClassWork country = new ClassWork();
		System.out.println(country.countryContinent("Peru"));
///////////
		
		Product q1 = new Product("orange", 5, 4);
		Product q2 = new Product("banana", 5, 2);
	//	System.out.println(q1.equals( q2));
		q1.print();
		
		if(q1.getPrice() > q2.getPrice()) {
			q1.print();
		} else {
			q2.print();
		}
		
	}

}
