package HW7;

import java.util.HashSet;
import java.util.Set;

public class Task_1 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		
		set1.add(1);
		set1.add(3);
		set1.add(9);
		set1.add(2);
		
		set2.add(2);
		set2.add(8);
		set2.add(7);
		set2.add(4);
		
		System.out.println(union(set1, set2));
		System.out.println("");
		System.out.println(intersect(set1, set2));
	}
	
	public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
		Set<T> set0 = new HashSet<T>();
		set0.addAll(set1);
		set0.addAll(set2);
		return set0;
	}
	
	public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
		Set<T> set0 = new HashSet<T>();
		set0.addAll(set1);
		set0.retainAll(set2);
		return set0;
	}
}