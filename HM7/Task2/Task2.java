import java.util.Map;
import java.util.TreeMap;

public class Task2 {

	public static void main(String[] args) {
		Map<String, String> personMap = new TreeMap<String, String>();
		personMap.put("Yurii ", "Shyshkin");
		personMap.put("Yurii2 ", "Shyshkin");
		personMap.put("Yurii3 ", "Shyshkin");
		personMap.put("Yurii4 ", "Shyshkin");
		personMap.put("Orest ", "Shyshkin");
		personMap.put("Yurii5 ", "Shyshkin");
		personMap.put("Orest ", "Shyshkin");
		personMap.put("Yuri6 ", "Shyshkin");
		personMap.put("Yurii7 ", "Shyshkin");
		personMap.put("Orest3 ", "Shyshkin");
		show(personMap);
		personMap.remove("Orest ");
		System.out.println();
		show(personMap);

	}

	public static void show(Map<String, String> personMap) {
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
