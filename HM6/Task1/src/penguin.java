
public class penguin extends notFlyingBeard {

	public penguin(String feather, String layEggs) {
		super(feather, layEggs);
	}

	@Override
	public void feathers() {
		System.out.println(getFeather());
	}

	@Override
	public void layEggs() {
		System.out.println("penguin lay eggs? " + getLayEggs());

	}
}