package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String,String>personMap = new HashMap<>();

       personMap.put("Beg", "Oleg");
       personMap.put("Red", "Orest");
       personMap.put("Fed", "Vova");
       personMap.put("Xek", "Ira");
       personMap.put("Mex", "Orest");
       personMap.put("Ded", "Vika");
       personMap.put("Asa", "Lida");
       personMap.put("Kok", "Olga");
       personMap.put("Ted", "Roman");
       personMap.put("Das", "Vasya");

        for (Map.Entry<String,String> entry:personMap.entrySet()) {
            System.out.println(entry.getKey() + " " +  entry.getValue());
        }

        for (Map.Entry<String,String> entry:personMap.entrySet()) {
           if (entry.getValue().equals("Ira")) personMap.remove(entry.getKey(),entry.getValue());

        }

        System.out.println(" ");
        for (Map.Entry<String,String> entry:personMap.entrySet()) {
            System.out.println(entry.getKey() + " " +  entry.getValue());
        }
    }
}
