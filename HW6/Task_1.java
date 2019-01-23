package HW6;

public class Task_1 {
	public static void main(String[] args) {
		Bird[] bird = new Bird[4];
		
		bird[0] = new Eagle ();
		bird[1] = new Swallow ();
		bird[2] = new Penguin ();
		bird[3] = new Chicken ();
		
		System.out.println("Does this bird fly?");
		for (int i = 0; i < bird.length; i++) {
			bird[i].print();
			if(bird[i] instanceof FlyingBird) {
				System.out.println(bird[i].fly());
			}
			else {
				System.out.println(bird[i].fly());
			}
		}
	}
}