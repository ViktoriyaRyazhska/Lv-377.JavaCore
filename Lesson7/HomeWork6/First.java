package SoftServe.Lesson7.HomeWork6;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class First {
    public static void main(String[] Args) {
        Set set1 = new TreeSet();
        Set set2 = new TreeSet();
        for (int i = 0; i < 10; i++) {
            set1.add(i);
        }
        for (int i = 6; i < 15; i++) {
            set2.add(i);
        }
        System.out.println("set1 ");
        showSet(set1);
        System.out.println();
        System.out.println("set2 ");
        showSet(set2);
        System.out.println();
        System.out.println("union ");
        showSet(union(set1, set2));
        System.out.println();
        System.out.println("intersect ");
        showSet(intersect(set1, set2));
    }

    public static void showSet(Set set) {
        for (Iterator iterator = set.iterator(); iterator.hasNext(); ) {
            System.out.print(iterator.next()+", ");
        }
    }

    public static Set union(Set set1, Set set2) {
        Set set = new TreeSet();
        set.addAll(set1);
        set.addAll(set2);
        return set;
    }

    public static Set intersect(Set set1, Set set2) {
        Set set = new TreeSet();
        Object i;
        for (Iterator iterator1 = set1.iterator(); iterator1.hasNext(); ) {
            i = iterator1.next();
            if (!set2.contains(i)) {
                set.add(i);
            }
        }
        for (Iterator iterator2 = set2.iterator(); iterator2.hasNext();) {
            i = iterator2.next();
            if (!set1.contains(i)) {
                set.add(i);
            }
        }
        return set;
    }
}
