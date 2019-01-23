package Home_work_5_Inheritance_Birds;

public class Main {

	public static void main(String[] args) {
		
		// Develop abstract class Bird with attributes feathers and layEggs and an
		// abstract method fly().
		// Develop classes FlyingBird and NonFlyingBird. Create class Eagle, Swallow,
		// Penguin and Chicken.
		// Create array Bird and add different birds to it.
		// Call fly() method for all of it. Output the information about each type of
		// created bird.

		Bird[] array = new Bird[6];
		array[0] = new Eagle();
		array[1] = new Eagle();
		array[2] = new Swallow();
		array[3] = new Penguin();
		array[4] = new Chicken();
		array[5] = new Chicken();

		for (int i = 0; i < array.length; i++) {

			array[i].fly();

			if (array[i] instanceof FlyingBird) {
				((FlyingBird) array[i]).feathers();
			} else if (array[i] instanceof NonFlyingBird) {
				((NonFlyingBird) array[i]).feathers();
			}
		}
	}

}
