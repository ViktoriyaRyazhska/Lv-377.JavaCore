package list;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set3 = new HashSet<Integer>();
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			set1.add(r.nextInt(20));			
		}
		for(int i =0; i < 6; i++) {
			set2.add(r.nextInt(10));
		}
		System.out.println(set1);
		System.out.println(set2);
		
		union(set, set1, set2);
		System.out.println(set);
		System.out.println(set.containsAll(set1));
		System.out.println(set.containsAll(set2));
		
		
		intersect(set3, set1, set2);
		System.out.println(set3);
		
		}
		public static void union(Set<Integer> set, Set<Integer> set1, Set<Integer> set2) {
		
			set.addAll(set1);
			set.addAll(set2);
	
		}
		
		public static void intersect(Set<Integer> set3, Set<Integer> set1, Set<Integer> set2) {
			for(Integer i : set1) {
				for(Integer j : set2) {
					if(i == j) {
						set3.add(i);
					}
				}
			}
		}
}
