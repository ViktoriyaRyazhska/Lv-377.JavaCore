
public class Kiwi extends notFlyingBeard {

	public Kiwi(String feather, String layEggs) {
		super(feather, layEggs);

	}

	@Override
	public void feathers() {
		System.out.println("Kiwi has " + getFeather() + "feather");

	}

	@Override
	public void layEggs() {
		System.out.println("Did Kiwi lay eggs? " + getLayEggs());

	}

}