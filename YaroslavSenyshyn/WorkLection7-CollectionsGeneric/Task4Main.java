package CollectionsGeneric;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Task4Main {

	public static void main(String[] args) {

		HashMap<String, String> personMap = new HashMap<String, String>();
		personMap.put("Penrenko", "Ivan");
		personMap.put("Zub", "Petro");
		personMap.put("Sokil", "Andrij");
		personMap.put("Andro", "Ivan");
		personMap.put("Pen", "Ivon");
		personMap.put("Zubik", "Pedro");
		personMap.put("Sokil", "Andrej");
		personMap.put("Oves", "Inna");

		print(personMap);
		findSameFirstName(personMap);
		String removeName = "Petro";
		removeConcretName(personMap, removeName);
		print(personMap);

	}

	public static void print(HashMap<String, String> personMap) {
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public static void findSameFirstName(HashMap<String, String> personMap) {
		HashSet<String> personFirstNameSet = new HashSet<String>();
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			if (!(personFirstNameSet.add(entry.getValue()))) {
				System.out.println("Present the same name: " + entry.getValue());
			}
		}
	}

	public static void removeConcretName(HashMap<String, String> personMap, String removeName) {
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			if (entry.getValue() == removeName) {
//				personMap.remove(entry.getKey());///don't work ????
				removeName = entry.getKey();
			}
		}
		personMap.remove(removeName);
	}

}
