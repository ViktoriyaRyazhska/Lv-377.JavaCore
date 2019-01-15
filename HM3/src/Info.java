
public class Info {

	public static void main(String[] args) {
		Persson P1 = new Persson("Anna", 1998);
		Persson P2 = new Persson();
		P2.inPutName();
		P2.inPutBirth();

		System.out.println(P1);
		System.out.println(P2);
		P1.changeName();
		System.out.println(P1);
		P2.changeName();
		System.out.println(P2);
		
	}

}
