package Lesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		
		List<Integer> myCollection = new ArrayList<Integer>();
		Random rand=new Random();
		for (int i = 0; i < 10; i++) {
			myCollection.add(rand.nextInt(15));	
			
	    }
		System.out.println(myCollection);
		
	
	 for (int i = 0; i < 10; i++) {
			if((myCollection.get(2)!=null)&&(myCollection.get(8)!=null)&&(myCollection.get(5)!=null)) {
				
				myCollection.remove(2);
				myCollection.add(2, 1);
				myCollection.remove(8);
				myCollection.add(8, -3);
				myCollection.remove(5);
				myCollection.add(5, -4);
			};	
		  }
	 	
	 	System.out.println(myCollection);
	 	Collections.sort(myCollection);
	 	System.out.println(myCollection);

		
	
		List<Integer> newCollections = new ArrayList<Integer>();
		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) > 5) {
				newCollections.add(i);
			}
		}
			System.out.println(newCollections);
		
		for (int i=0; i<myCollection.size(); i++ ) {
			if(myCollection.get(i)>20) {
				myCollection.remove(i);
				i--;
			}
			
			
		}
			
		System.out.println(myCollection);
	

	}

}



//Declare collection myCollection of 10 integers and fill it (from the console or random).
//Find and save in list newCollection all positions of element more than 5 in the collection. Print newCollection
//Remove from collection myCollection elements, which are greater then 20. Print result
//Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx”
//Sort and print collection 
//
//Use next Collections for this tasks: List, ArrayList, LinkedList
