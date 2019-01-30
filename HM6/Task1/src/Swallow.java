
public class Swallow extends flyingBeard {

	public Swallow(String feather, String layEggs) {
		super(feather, layEggs);
	}

	@Override
	public void feathers() {
		System.out.println("Swallow has " + getFeather() + "feather");
	}

	@Override
	public void layEggs() {
		System.out.println("Swallow lay eggs? " + getLayEggs());

	}
}
