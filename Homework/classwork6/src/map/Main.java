package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		Map< Integer, String> employeeMap = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		employeeMap.put(1, "Vasya");
		employeeMap.put(2, "Ivan");
		employeeMap.put(3, "Kolya");
		employeeMap.put(4, "Anna");
		employeeMap.put(5, "Oksana");
		employeeMap.put(6, "Nastya");
		employeeMap.put(7, "Jylia");
		
		System.out.println(employeeMap);
		System.out.println("Input key");

			int key = Integer.valueOf(br.readLine());
			if(employeeMap.containsKey(key)) {
			System.out.println((String) employeeMap.get(key));
		}else {
			System.out.println("This key is apsent");
		}
		

		System.out.println("Input name");
		String name = br.readLine();
		
			   if(employeeMap.containsValue(name)) {				
				  Set<Entry<Integer, String>> entries =  employeeMap.entrySet();
				   Iterator<Entry<Integer, String>> iterator = entries.iterator();
				   while (iterator.hasNext()) {
					   Entry<Integer, String> next = iterator.next();
					if(next.getValue().equals(name)) {
						System.out.println(next.getKey());
					}
					
				}
			   
			   }else {
					System.out.println("This name apsent");
				}

	}

}
