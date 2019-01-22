package OOPInheritance;

public class AnnimalMain {

	public static void main(String[] args) {
		Animal[] annimal = new Animal[4];
		annimal[0] = new Dog();
		annimal[1] = new Dog();
		annimal[2] = new Cat();
		annimal[3] = new Cat();
		
		for (int i = 0; i < annimal.length; i++) {
			System.out.println(i+1);
			annimal[i].voice();
			annimal[i].feed();
			
		}
	}

}
