package Home_work_5_Inheritance_Birds;

public abstract class FlyingBird extends Bird{
	
	@Override
	public void fly() {
		System.out.println(getGroup());
		System.out.println("I can fly.");
		setLayEggs(true);
	}
	
	public abstract void feathers();
	
	//I write this method here to study casting.
}
