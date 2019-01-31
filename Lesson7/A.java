package SoftServe.Lesson7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class A {
    public static void main(String[] Args) {


        List<Integer> myCollection = new ArrayList<Integer>();

        Random r = new Random();
        for (int i = 0; i <= 10; i++) {
            myCollection.add(r.nextInt(30));
        }

        showCollection(myCollection);

        List<Integer> newCollection = new ArrayList<Integer>();
        for (Integer q : myCollection) {
            if (q > 5) {
                newCollection.add(q);
            }
        }
        System.out.println();
        showCollection(newCollection);

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                myCollection.remove(i);
            }
        }
        System.out.println();
        showCollection(myCollection);

        insertElement(myCollection, 2, 1);
        insertElement(myCollection, 8, -3);
        insertElement(myCollection, 5, -4);

        System.out.println();
        showCollection(myCollection);

        myCollection.sort(Integer::compareTo);
        System.out.println();
        showCollection(myCollection);

    }

    static void showCollection(List<Integer> collection) {
        for (Integer q : collection) {
            System.out.print(q+", ");
        }
    }

    static void insertElement(List<Integer> collection, int indexOfElement, int element) {
        if (collection.size() >= indexOfElement) {
            collection.add(indexOfElement, element);
        } else {
            collection.add(element);
        }
    }

    static class SortComparator implements Comparator<Integer> {


        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.intValue() - o2.intValue();
        }
    }
}