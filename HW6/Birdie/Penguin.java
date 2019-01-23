package hw6.softserve;

public class Penguin extends NotFlyingBird{

	public Penguin(String feathers, String layEggs) {
		super(feathers, layEggs);
		
	}

	@Override
	public void fly() {
		System.out.println("[Penguin]");
		System.out.println("Flyes: No");
		System.out.println("Feathers: " + getFeathers());
		System.out.println("Lay eggs: " + getLayEggs());
	}

}
