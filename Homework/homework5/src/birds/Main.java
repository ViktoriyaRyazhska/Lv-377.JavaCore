package birds;

public class Main {

	public static void main(String[] args) {
		Bird[] mas = {new Eagle("long", "yes"), new Swallow("acute", "yes"), new Penguin("fluff", "yes"), new Chicken("soft", "yes")};
		
		for(int i = 0; i < mas.length; i++) {
			mas[i].fly();
			System.out.println(mas[i]);
		}
	}

}
