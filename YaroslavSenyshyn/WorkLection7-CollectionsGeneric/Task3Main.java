package CollectionsGeneric;

import java.util.HashSet;
import java.util.Set;

public class Task3Main {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(4);
		set2.add(3);
		set2.add(2);
		set2.add(6);
		set2.add(7);
////////task1
		for (Integer integer : Task3Main.union(set1, set2)) {
			System.out.println(integer);
		}
		System.out.println();
		for (Integer integer : Task3Main.intersect(set1, set2)) {
			System.out.println(integer);
		}

	}
//////task1
	public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> intersect = new HashSet<Integer>();
		for (Integer integer : set1) {
			if (set2.contains(integer)) {
				intersect.add(integer);
			}
		}
		return intersect;
	}

	public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> union = new HashSet<Integer>();

		for (Integer integer : set1) {
			union.add(integer);
		}

		for (Integer integer : set2) {
			if (!set1.contains(integer)) {
				union.add(integer);
			}
		}
		return union;
	}
}
