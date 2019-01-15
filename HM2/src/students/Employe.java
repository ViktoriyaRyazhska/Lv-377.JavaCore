package students;

public class Employe {

	public static void main(String[] args) {
		work w1 = new work("Anna", 12, 8);

		work w2 = new work("Vova", 8);
		w2.setHours(7);

		work w3 = new work();
		w3.setHours(9);
		w3.setName("Petro");
		w3.setRate(5);

		System.out.println(w1);
		System.out.println(w2.toString());
		System.out.println(w3.toString());
		System.out.println();
		System.out.println(w1.salary());
		System.out.println(w2.salary());
		System.out.println(w3.salary());
		System.out.println();
		System.out.println(w1.bonuses());
		System.out.println(w2.bonuses());
		System.out.println(w3.bonuses());
		System.out.println(work.getTotalSum());
	}

}
