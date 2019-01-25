package CollectionsGeneric;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;


public class Task1Main {

	public static void main(String[] args) throws ConcurrentModificationException{
		MyCollection arrayList = new MyCollection();
		
		MyCollection.printArray(arrayList.getArrayList());
		
		List<Integer> positionMoreThenArray = new ArrayList<Integer>();
		positionMoreThenArray = MyCollection.findAndSavePositionElimentMoreThen(arrayList.getArrayList(), 5);
		
		System.out.println();
		MyCollection.printArray(positionMoreThenArray);
		System.out.println();
		MyCollection.removeElementMoreThen(arrayList.getArrayList(), 20);
		MyCollection.printArray(arrayList.getArrayList());
		positionMoreThenArray.add(2, -3);
		MyCollection.add(arrayList.getArrayList(), 2, 1);
		MyCollection.add(arrayList.getArrayList(), 8, -3);
		MyCollection.add(arrayList.getArrayList(), 5, -4);
		System.out.println();
		MyCollection.sort(arrayList.getArrayList());
		MyCollection.printArray(arrayList.getArrayList());
	//	arrayList.add(arrayList.getArrayList(), 3, -999);
	System.out.println();
		System.out.println(arrayList);
		
		
	}
}

/*
 * Declare collection myCollection of 10 integers and fill it (from the console
 * or random).​ Find and save in list newCollection all positions of element
 * more than 5 in the collection. Print newCollection​ Remove from collection
 * myCollection elements, which are greater then 20. Print result​ Insert
 * elements 1, -3, -4 in positions 2, 8, 5. Print result in the format:
 * “position – xxx, value of element – xxx”​ Sort and print collection ​ ​ Use
 * next Collections for this tasks: List, ArrayList, LinkedList​
 */