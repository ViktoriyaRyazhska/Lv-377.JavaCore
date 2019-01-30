package HW7;

import java.util.HashMap;
import java.util.Map;

public class Task_2 {
	public static void main(String[] args) {
		
		String lastName = null;
		String firstName = "We";
		
		HashMap<String, String> personMap = new HashMap<String, String>();
		 
		personMap.put("01", "Jo");
		personMap.put("02", "Hu");
		personMap.put("03", "Li");
		personMap.put("04", "We");
		personMap.put("05", "Go");
		personMap.put("06", "To");
		personMap.put("07", "Ho");
		personMap.put("08", "Me");
		personMap.put("09", "Jo");
		personMap.put("10", "We");
	 
		for(Map.Entry<String, String> entry: personMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
		System.out.println("\nThe same name:");
		for (Map.Entry<String, String> entry: personMap.entrySet()) {
			if (entry.getValue().equals(firstName)) {
				System.out.println(entry.getKey() + " - " + entry.getValue());
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (Map.Entry<String, String> entry: personMap.entrySet()) {
				if (entry.getValue().equals(firstName)) {
					lastName = entry.getKey();
					break;
				}
			}
			
			if (lastName != null) {
				personMap.remove(lastName);
			}
		}
		
		System.out.println("\nAfter removing the key:");
		for(Map.Entry<String, String> entry: personMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
	}
}