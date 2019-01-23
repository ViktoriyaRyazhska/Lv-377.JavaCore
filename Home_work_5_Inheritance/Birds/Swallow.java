package Home_work_5_Inheritance_Birds;

public class Swallow extends FlyingBird {
	
	public Swallow() {
		setGroup("Swallow");
		setFeathers("white feathers.");
		
    }
	
	@Override
	public void feathers() {
		System.out.println("I have " + getFeathers());
	}
}
