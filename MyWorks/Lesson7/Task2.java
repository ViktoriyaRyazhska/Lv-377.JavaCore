package Lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Map<Integer, String> employeeMap = new HashMap<Integer, String>();

		employeeMap.put(1, "Alex");
		employeeMap.put(2, "Bob");
		employeeMap.put(3, "Andry");
		employeeMap.put(4, "Pieter");
		employeeMap.put(5, "Sem");
		employeeMap.put(6, "John");
		employeeMap.put(7, "Mike");
		employeeMap.put(8, "Tom");
		employeeMap.put(9, "David");
		employeeMap.put(10, "Robert");

		for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println();
		System.out.println("Enter employee id: ");
		Integer id = Integer.parseInt(br.readLine());
		
		if (employeeMap.containsKey(id)) {
			System.out.println("The name of this employee " + employeeMap.get(id));
		} else {
			System.out.println("No employee with this id number!");
		}

		System.out.println();
		System.out.println("Enter employee name: ");
		String name = br.readLine();
		
		if (employeeMap.containsValue(name)) {
			for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {

				if (name.equals(entry.getValue())) {
					System.out.println("The ID number of this employee " + entry.getKey());

				}

			}
		} else {
			System.out.println("No employee with this name!");
		}

	}

}

// In the main() method declare map employeeMap of pairs <Integer, String>.
// Add to employeeMap seven pairs (ID, name) of some persons. Display the map on
// the screen.
// Ask user to enter ID, then find and write corresponding name from your map.
// If you can't find this ID - say about it to user (use function
// containsKey()).
// Ask user to enter name, verify than you have name in your map and write
// corresponding ID. If you can't find this name - say about it to user (use
// function containsValue()).
