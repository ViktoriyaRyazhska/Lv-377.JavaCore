package birds;

public abstract class NonFlyingBird extends Bird{
	
	public NonFlyingBird(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public abstract void fly();
}
