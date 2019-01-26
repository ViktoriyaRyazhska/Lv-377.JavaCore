package birds;

public abstract class FlyingBird extends Bird{
	
	public FlyingBird(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public abstract void fly();
	

}
