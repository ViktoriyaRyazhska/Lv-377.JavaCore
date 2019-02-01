
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class maiiiiin {

	public static void main(String[] args) {
		Set<Integer> set1 = new TreeSet<Integer>();
		Set<Integer> set2 = new TreeSet<Integer>();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			set1.add(r.nextInt(30));
		}
		for (int i = 0; i < 10; i++) {
			set2.add(r.nextInt(30));
		}
		System.out.println("Show Set1");
		System.out.println(set1);
		System.out.println("Show Set2");
		System.out.println(set2);
		System.out.println("union ");
		ShowSet(union(set1, set2));
		System.out.println();
		System.out.println("intersect ");
		ShowSet(intersect(set1, set2));
	}

	public static void ShowSet(Set<Integer> set) {
		for (Object i : set) {
			System.out.print(i + ", ");
		}

	}

	public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> set = new TreeSet<Integer>();
		set.addAll(set1);
		set.addAll(set2);
		return set;
	}

	public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> set = new TreeSet<Integer>();
		Object e;
		for (Object i : set1) {
			e = i;
			if (!set2.contains(e)) {
				set.add((Integer) e);
			}
			for (Object r : set2) {
				e = r;
				if (!set1.contains(e)) {
					set.add((Integer) e);
				}
			}

		}
		return set;
	}
}
