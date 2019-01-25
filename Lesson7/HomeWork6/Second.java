package SoftServe.Lesson7.HomeWork6;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Second {
    public static void main(String[] Args) {
        Map<String, String> personMap = new TreeMap<String, String>();  // lastName, firstName
        personMap.put("Andriy", "Verkholiak");
        personMap.put("Ivan", "Pupkin");
        personMap.put("Roman", "Baran");
        personMap.put("Vasay", "Vaskiv");
        personMap.put("Taras", "Gas");
        personMap.put("Nazar", "Azar");
        personMap.put("LastName", "FirstName");
        personMap.put("Orest", "Podoleckiy");
        personMap.put("Dinosaur", "Dinosaurovich");
        personMap.put("Petro", "Petrovich");

        showMap(personMap);
        personMap.remove("Orest");
        System.out.println();
        showMap(personMap);
    }

    static void showMap(Map map) {
        for (Iterator i = map.entrySet().iterator(); i.hasNext();){
            Map.Entry entry = (Map.Entry) i.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
