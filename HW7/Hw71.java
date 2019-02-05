package hw7.softserve;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Hw71 {


	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<Integer>();

		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			set1.add(r.nextInt(30));
		}
		System.out.println(set1);
		
		Set<Integer> set2 = new HashSet<Integer>();

		Random q = new Random();
		for (int j = 0; j < 10; j++) {
			set2.add(q.nextInt(30));
		}
		System.out.println(set2);
		
		Set<Integer> copy = new HashSet<>(set1);
		
		unite(set1, set2);
		
		System.out.println("united: " + set1);
		
		
		intersect(copy, set2);
		
		System.out.println("intersected: " + copy);
	}

	private static void intersect(Set<Integer> copy, Set<Integer> set2) {
		
		copy.retainAll(set2);
		
		}

	private static void unite(Set<Integer> set1, Set<Integer> set2) {
		
	set1.addAll(set2);
	
		
		}
	}




