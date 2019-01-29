import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapPerson {
	public static String k;

	public static void main(String[] args) {
		Map<String,String> pMap=new  HashMap<String,String>(); //Створюю колекцію та записую в неї 10 елементів
		pMap.put("Mudruk", "Orest");
		pMap.put("Mudru", "Ores");
		pMap.put("Mudr", "Ore");
		pMap.put("Mud", "Or");
		pMap.put("Mu", "O");
		pMap.put("Rowling","Joanne");
		pMap.put("Rowlin","Joann");
		pMap.put("Rowli","Joan");
		pMap.put("Rowl","Joa");
		pMap.put("Row","Ore");
		
		System.out.println(pMap);			//Виводжу на екран колекцію pMap
		
		HashSet<String> pSet=new HashSet<String>();		 //Для перевірки наявності однакових значень створюю масив HashSet
		for (Map.Entry<String, String> entry: pMap.entrySet())	
		  if (!(pSet.add(entry.getValue()))) {						//При наявності однакових значень буде виведено повідомлення про помилку
		    	System.out.println("Detected same firstname	 "+entry.getValue());
		    	
		    };
		    
		    String removeValue="Orest";			
		    
		for (Map.Entry<String, String> entry: pMap.entrySet()) {   // Тут мав би бути інший спосіб. підкажете??
			if(removeValue.equals(entry.getValue())) {
				k=entry.getKey();
			}
		}
		
		pMap.remove(k);
		
		     
		System.out.println(pMap);
		      
		 

		
		
		

	}

}
