
public class Eagle extends flyingBeard {

	public Eagle(String feather, String layEggs) {
		super(feather, layEggs);
	}

	@Override
	public void feathers() {
		System.out.println("Eagle has " + getFeather() + " feather");
	}

	@Override
	public void layEggs() {
		System.out.println("Eagle lay eggs? " + getLayEggs());
	}
}