package Lesson7;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Hw1 {

	public static void main(String[] args) {

		Random rand = new Random();

		Set<Integer> s1 = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			s1.add(rand.nextInt(15));
		}
		System.out.println(s1);

		Set<Integer> s2 = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			s2.add(rand.nextInt(15));
		}
		System.out.println(s2);

		Set<Integer> result = new HashSet<>(s1);
		result.addAll(s2);
		System.out.println(result);

		Set<Integer> result2 = new HashSet<>(s1);
		result2.retainAll(s2);
		System.out.println(result2);

	}

}

// Write parameterized methods union(Set set1, Set set2)
// and intersect(Set set1, Set set2),
// realizing the operations of union and intersection of two sets.
// Test the operation of these techniques on two pre-filled sets.
