package Home_work_5_Inheritance_Birds;

public abstract class NonFlyingBird extends Bird {
	
	@Override
	public void fly() {
		System.out.println(getGroup());
		System.out.println("I cann't fly.");
		setLayEggs(true);
	}
	
	public abstract void feathers();
}
