import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersect {
	
	public static void fillSetFromArray(Set<String> mySet, String[] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			mySet.add(myArray[i]);
		}
	}
	
	public static Set<String> union (Set<String> mySet1, Set<String> mySet2){
			Set<String> unionSet = new HashSet<String>();
			unionSet.addAll(mySet1);
			unionSet.addAll(mySet2);			
		return unionSet;
	}
	
	public static Set<String> intersect (Set<String> mySet1, Set<String> mySet2){
		Set<String> intersectedSet = new HashSet<String>();
		intersectedSet.addAll(mySet1);
		intersectedSet.retainAll(mySet2);
		return intersectedSet;
	}

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		
		String[] names1 = {"Artur", "Snizhana", "Svitlana", "Oleg", "Marta"};
		String[] names2 = {"Artem", "Oleg", "Marta"};
		
		fillSetFromArray(set1, names1);
		System.out.println(set1);
		
		fillSetFromArray(set2, names2);
		System.out.println(set2);
		
		System.out.println(union(set1, set2));
		
		System.out.println(intersect(set1, set2));
		
	}

}
