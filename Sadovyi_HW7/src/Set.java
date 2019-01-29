import java.util.HashSet;
import java.util.Random;

public class Set {

	public static void main(String[] args) {
		HashSet<Integer> set1=new HashSet();		//Створюємо дві колекції
		HashSet<Integer> set2=new HashSet();
		

		Random rand;		
		for(int i=0; i<7;i++) {						//Заповнюємо колекції випадковими числами від 0 до 10
			rand=new Random();
			set1.add(rand.nextInt(10));				//Максимальна кількість елементів 7,  
			rand=new Random();						//але може бути менше(якщо числа повторюватимуться)
			set2.add(rand.nextInt(10));
			
		}
		System.out.println("set1"+set1);			//Виводимо в консоль створені колекції
		System.out.println("set2"+set2);
		
		
		System.out.println("Result Union (set1,set2) "+Union (set1,set2));		//Виводимо результати 
		System.out.println("Result Intersect(set1,set2) "+Intersect(set1,set2));//створених нижче методів Union та Intersect
		
		
		
		
	}	

	private static  HashSet<Integer> Union(HashSet<Integer> set1, HashSet<Integer> set2) {
		HashSet<Integer> resultUnion = new HashSet<Integer>(set1);
		resultUnion.addAll(set2);
		return resultUnion;
				
	}
	
	private static HashSet<Integer> Intersect(HashSet<Integer> set1, HashSet<Integer> set2) {
		HashSet<Integer> resultIntersect = new HashSet<Integer>(set1);
		resultIntersect.retainAll(set2);
		return resultIntersect;
		
	}
}
