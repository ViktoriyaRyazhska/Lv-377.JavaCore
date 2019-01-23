package hw6.softserve;

public class Chicken extends NotFlyingBird{

	public Chicken(String feathers, String layEggs) {
		super(feathers, layEggs);
		
	}

	@Override
	public void fly() {
		System.out.println("[Chicken]");
		System.out.println("Flyes: No");
		System.out.println("Feathers: " + getFeathers());
		System.out.println("Lay eggs: " + getLayEggs());
		
	}
	

}
