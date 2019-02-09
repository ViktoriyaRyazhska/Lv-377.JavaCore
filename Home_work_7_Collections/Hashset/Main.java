package Home_work_7_Collections.Hashset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

	// Write parameterized methods union(Set set1, Set set2) and intersect(Set set1,
	// Set set2), realizing the operations of union and intersection of two sets.
	// Test the operation of these techniques on two pre-filled sets.

	public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> union = new HashSet<Integer>();
		union.addAll(set1);
		union.addAll(set2);
		return union;
	}

	public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> intersect = new HashSet<Integer>();
		intersect.addAll(set1);
		intersect.retainAll(set2);
		return intersect;
	}

	public static void main(String[] args) {

		Random rd = new Random();

		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			set1.add(rd.nextInt(15));
			set2.add(rd.nextInt(10));
		}

		System.out.println(set1);
		System.out.println(set2);

		Set<Integer> unionSet = union(set1, set2);
		System.out.println(unionSet);

		Set<Integer> intersectSet = intersect(set1, set2);
		System.out.println(intersectSet);
	}

}
