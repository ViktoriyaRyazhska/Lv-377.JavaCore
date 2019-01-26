package list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> myCollection = new ArrayList<Integer>();
		Random r = new Random();
	    for(int i =0; i < 10; i++) {
	    	myCollection.add(r.nextInt(30));
	    }
	    System.out.println(myCollection);
	    ArrayList<Integer> newCollection = new ArrayList<Integer>();
	    for(int x : myCollection) {
	    	if(x > 5) {
	    	newCollection.add(x);
	    	} 	
	    }
	    System.out.println("element more than 5 :");
	 System.out.println(newCollection);

	    Iterator<Integer> it = myCollection.iterator( );
	    while (it.hasNext( )) {
	        if((Integer)it.next() > 20) {
	        	it.remove();
	    }	 
	    }
	    System.out.println("Remove from collection myCollection elements, which are greater then 20 :");
	 System.out.println(myCollection);
	 for(int c : myCollection) {
		 if(myCollection.indexOf(c) == 2) {
			 myCollection.set(myCollection.indexOf(c), 1);
		 }if(myCollection.indexOf(c) == 5) {
			  myCollection.set(myCollection.indexOf(c), -3);
		 }
		 if(myCollection.indexOf(c) == 8) {
			 myCollection.set(myCollection.indexOf(c), -4); 	
		 }	  
	 }
	 System.out.println(myCollection);
	 for(int c : myCollection) {
	 		 System.out.println(myCollection.indexOf(c) + " " + myCollection.get(myCollection.indexOf(c)));
	 }
	 myCollection.sort(Comparator.naturalOrder());
     System.out.println(myCollection);
	}

}
