package birds;

public class Penguin extends NonFlyingBird{

	public Penguin(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public void fly() {
		System.out.println("Penguin nonFlying");
		
	}

}
