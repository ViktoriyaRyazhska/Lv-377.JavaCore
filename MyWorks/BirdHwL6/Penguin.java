package BirdHwL6;

public class Penguin extends NonFlyingBird {

	Penguin() {
		feathers = false;
		layEggs = true;
	}

	public void getType() {
		System.out.println("This is Penguin");
	}

}
