package Home_work_5_Inheritance_Birds;

public class Chicken extends NonFlyingBird {

	public Chicken() {
		setGroup("Chicken");
		setFeathers("different feathers.");
	}

	@Override
	public void feathers() {
		System.out.println("I have " + getFeathers());
	}
}
