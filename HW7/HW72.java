package hw7.softserve;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HW72 {

	public static void main(String[] args) {
		
		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("Schicklgruber", "Orest");
		personMap.put("Voroshilov", "Adolf");
		personMap.put("Pinochet", "Augusto");
		personMap.put("Krupskiy", "Vova");
		personMap.put("Jugashvilly", "Yosyp");
		personMap.put("Ragulevich", "Yosyp");
		
		
		for(Map.Entry<String, String> entry: personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
		Set<Object> set=new HashSet<>();
        List<Object> list=new ArrayList<>();

        for(Entry<String, String> mapVal:personMap.entrySet()) {

            if(!set.add(mapVal.getValue())) {
                list.add(mapVal.getValue());

            }else {
                set.add(mapVal.getValue());
            }

        }
        
        System.out.println("We have same names:");

for(Entry<String, String> mapVal:personMap.entrySet()) {

    if(list.contains(mapVal.getValue())){

        System.out.println(mapVal.getKey() +" " + mapVal.getValue());
    
    }
}
    remove(personMap, "Orest");
    System.out.println(personMap);
}

public static void remove(Map<String, String> myMap, String name) {
	if (myMap.containsValue(name)) {
		for (Iterator<Map.Entry<String,String>> ent  = myMap.entrySet().iterator(); ent.hasNext();) {
			if (ent.next().getValue().equalsIgnoreCase(name)){
				ent.remove();
			}
		}
	}
}
}

