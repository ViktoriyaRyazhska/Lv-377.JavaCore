package CollectionsGeneric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task2Main {

	public static void main(String[] args) throws IOException {
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		employeeMap.put(121, "Inna");
		employeeMap.put(122, "Anya");
		employeeMap.put(123, "Ivan");
		employeeMap.put(124, "Petro");
		employeeMap.put(125, "Vasyl");
		employeeMap.put(126, "Ihor");
		employeeMap.put(127, "Ira");

		System.out.println(employeeMap);

		Task2Main.getName(employeeMap, br);
		Task2Main.getId(employeeMap, br);
		br.close();
	}

	public static void getName(Map<Integer, String> employeeMap, BufferedReader br)
			throws NumberFormatException, IOException {
		System.out.println("Pleas enter ID");
		int i = Integer.parseInt(br.readLine());
		if (employeeMap.containsKey(i)) {
			System.out.println("Name for " + i + ": " + employeeMap.get(i));
		} else
			System.out.println("Can't find this ID, it's absent in list!");
	}

	public static void getId(Map<Integer, String> employeeMap, BufferedReader br) throws IOException {

		System.out.println("Pleas enter name");
		String name = br.readLine();
		int temp = 0;
//		Iterator<Map.Entry<Integer, String>> iter = employeeMap.entrySet().iterator();

		for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
			temp++;
			if (entry.getValue().equals(name)) {
				temp = -1;
				System.out.println("ID for " + entry.getValue() + ": " + entry.getKey());
			} else if (temp == employeeMap.size() && temp != -1) {
				System.out.println("Can't find this Name, it's absent in list!");
			}
		}

	}

}