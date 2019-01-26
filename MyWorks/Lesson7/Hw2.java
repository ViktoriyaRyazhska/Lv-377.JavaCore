package Lesson7;

import java.io.IOException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hw2 {

	public static void main(String[] args) throws IOException {
		Map<String, String> person = new HashMap<String, String>();
		person.put("Francis", "Cloe");
		person.put("Bradfo", "Cloe");
		person.put("Hill", "Dallas");
		person.put("Cameron", "Nehemiah");
		person.put("Ford", "Rohan");
		person.put("Nancy", "Yu");
		person.put("Barajas", "Axel");
		person.put("Aileen", "Valencia");
		person.put("Elias", "Sem");
		person.put("Maxwell", "Sem");

		for (Map.Entry<String, String> entry : person.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}

		Map<String, String> map1 = new HashMap<String, String>();
		String val, key;
		for (Map.Entry<String, String> pair : person.entrySet()) {
			val = pair.getValue();
			key = pair.getKey();
			if (map1.containsValue(val)) {
				continue;
			} else {
				map1.put(key, val);
			}
		}
		Iterator<Map.Entry<String, String>> iterator = person.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> pair = iterator.next();
			iterator.remove();
		}

		for (Map.Entry<String, String> pair : map1.entrySet()) {
			key = pair.getKey();
			val = pair.getValue();
			person.put(key, val);
		}

		System.out.println();
		for (Map.Entry<String, String> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}

	}

}

// Create map personMap and add to it ten persons
// of type <String, String> (lastName, firstName).
// Output the entities of the map on the screen.
// There are at less two persons with the same firstName among these 10 people?
// Remove from the map person whose firstName is ”Orest” (or other). Print
// result.
