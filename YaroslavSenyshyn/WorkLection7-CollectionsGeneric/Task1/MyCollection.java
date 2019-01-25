package CollectionsGeneric;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class MyCollection {
	private List<Integer> arrayList;

	public List<Integer> getArrayList() {
		return arrayList;
	}

	public void setArrayList(List<Integer> arrayList) {
		this.arrayList = arrayList;
	}

	public MyCollection() {
		createArray();
	}

	public void createArray() {
		Random random = new Random();
		arrayList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			arrayList.add(random.nextInt(30));// (i+1)
		}
	}

	public static void printArray(List<Integer> arrayList) {

		for (Integer arr : arrayList) {
			System.out.print(arr + " ");
		}
	}

	public static List<Integer> findAndSavePositionElimentMoreThen(List<Integer> arrayList, int moreThen) {

		Iterator<Integer> iter = arrayList.iterator();

		List<Integer> positionElementMoreThenIntegers = new ArrayList<Integer>();
		int i = 0;
		while (iter.hasNext()) {
			int element = iter.next();
			i++;
			if (element > moreThen)
				positionElementMoreThenIntegers.add(i);
		}
		return positionElementMoreThenIntegers;
	}

	public static void removeElementMoreThen(List<Integer> arrayList, int moreThen) {
		Iterator<Integer> iter = arrayList.iterator();
		while (iter.hasNext()) {
			int element = iter.next();
			if (element > moreThen) {
				iter.remove();
			}
		}
///if do this, we having - ConcurrentModificationException/////////////////			
//		for (Integer arr : arrayList) {
//			if (arr>moreThen) {
//				arrayList.remove(arr);
//			}
//		}	
//	}
	}

	public static void add(List<Integer> arrayList, int index, int element) {	
		arrayList.add(index, element);
	}
	
	public static void sort(List<Integer> arrayList) {
		Collections.sort(arrayList);
	}
	
	@Override
	public String toString() {
		 for (int value : getArrayList()) {
	         System.out.print("Value: " + value);
	         int index = getArrayList().indexOf(value);
	         System.out.println(", position: " + index);
	   }
		
		return " ";
	}

}
