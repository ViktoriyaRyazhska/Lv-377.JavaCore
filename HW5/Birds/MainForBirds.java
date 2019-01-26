
public class MainForBirds {

	public static void main(String[] args) {
		Bird[] birds = {new Penguin(), new Chicken(), new Swallow(), new Eagle()};

		for (Bird bird: birds) {
			bird.fly();
			System.out.println(bird);
		}
	}

}
