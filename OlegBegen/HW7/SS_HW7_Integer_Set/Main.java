package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set a = new HashSet();
        Set b = new HashSet();

        for (int i = 1; i < 11; i++) {
            a.add(i);
        }
        for (int i = 8; i < 18; i++) {
           b.add(i);
        }
        System.out.println("Set 1:");
        System.out.println(a);
        System.out.println();
        System.out.println("Set 2");
        System.out.println(b);
        System.out.println();
        System.out.println("Union:");
        System.out.println(addSet(a, b));
        System.out.println("Intersection:");
        System.out.println(intersectionSet(a, b));
    }
    

    public static Set addSet (Set x, Set y){
        Set c = new HashSet();
        c.addAll(x);
        c.addAll(y);
        return c;
    }

    public static Set intersectionSet (Set x, Set y){
        Set c = new HashSet();
       Object z;
        for (Iterator it = x.iterator(); it.hasNext();){
            z = it.next();
            if (y.contains(z)){
                c.add(z);
            }
        }
        for (Iterator it1 = y.iterator();it1.hasNext();){
            z = it1.next();
            if(x.contains(z)){
                c.add(z);
            }
        }
        return c;
    }
}
