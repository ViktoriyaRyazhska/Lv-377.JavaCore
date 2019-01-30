
public abstract class flyingBeard extends Beard {

	public flyingBeard(String feather, String layEggs) {
		super(feather, layEggs);
	}

	@Override
	void fly() {
		System.out.println("This bird fly ");
	}

	public abstract void feathers();

	public abstract void layEggs();

}