import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class personMap {

	public static void fillMapFromArray(Map<String, String> myMap, String[][] myArray) {
		if (myArray[0].length == myArray[1].length) {
			for (int i = 0; i < myArray[0].length; i++) {
				myMap.put(myArray[0][i], myArray[1][i]);
			}
		} else {
			System.out.println("Lengths of arrays are different");
		}	
	}
	
	public static boolean arePersonsWithSameFirstName(Map<String, String> myMap) {
		Set<String> tempSet = new HashSet<String>();
		tempSet.addAll(myMap.values());
		System.out.println(tempSet);
		return myMap.size() == tempSet.size() ? false: true;
		
	}

	public static void removeFromMapByFirstname(Map<String, String> myMap, String firstname) {
		if (myMap.containsValue(firstname)) {
			for (Iterator<Map.Entry<String,String>> it  = myMap.entrySet().iterator(); it.hasNext();) {
				if (it.next().getValue().equalsIgnoreCase(firstname)){
					it.remove();
				}
			}
		} else {
			System.out.println("There is no such name in the map");
		}
	}
	
	public static void main(String[] args) {
		Map<String, String> persons = new HashMap<String, String>();
		String[][] lastAndFirstNames = 
			{{"Sydorov","Annenko",	"Did",	"Dorofeeva","Yablinskyi","Kulbida",	"Mazur", "Miroshyn","Kabaeva",	"Doshchak"},
			{"Sergiy",	"Svitlana",	"Anton","Anna",		"Orest",	 "Svitlana","Ievgen","Orest",	"Olena",	"Oleg"}};
		
		fillMapFromArray(persons, lastAndFirstNames);
		System.out.println(persons);

		System.out.println("Are there in the Map persons with same firstnames?: " + arePersonsWithSameFirstName(persons));
		
		removeFromMapByFirstname(persons, "Orest1");
		System.out.println(persons);
	}


}
