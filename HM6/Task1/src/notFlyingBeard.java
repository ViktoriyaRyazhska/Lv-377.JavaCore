
public abstract class  notFlyingBeard extends Beard {

	public notFlyingBeard(String feather, String layEggs) {
		super(feather, layEggs);
	}

	@Override
	void fly() {
		System.out.println("This bird dont fly");
	}

	public abstract void feathers();

	public abstract void layEggs();
	
	
}