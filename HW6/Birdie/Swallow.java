package hw6.softserve;

public class Swallow extends FlyingBird {

	public Swallow(String feathers, String layEggs) {
		super(feathers, layEggs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("[Swallow]");
		System.out.println("Flyes: Yes");
		System.out.println("Feathers: " + getFeathers());
		System.out.println("Lay eggs: " + getLayEggs());
	}
	
	

}
