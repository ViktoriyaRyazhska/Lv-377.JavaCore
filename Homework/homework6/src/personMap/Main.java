package personMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		Map<String, String> personMap = new HashMap<>();
		
		personMap.put("Pupkin", "Vasya");
		personMap.put("Lusuy", "Kolya");
		personMap.put("Insaid", "Vasya");
		personMap.put("Buben", "Ivan");
		personMap.put("Vesela", "Inna");
		personMap.put("Bober", "Kolya");
		personMap.put("Pukin", "Semen");
		personMap.put("Chorna", "Lilya");
		personMap.put("Vesna", "Anna");
		personMap.put("Buch", "Ira");
		
		System.out.println(personMap);

		
		for(Iterator i = personMap.entrySet().iterator(); i.hasNext();) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>)i.next();
			if(entry.getValue().equals("Semen")){
				System.out.println(entry.getKey());
				i.remove();
			
			}
						
		}
				System.out.println(personMap);	
				
	}

}
