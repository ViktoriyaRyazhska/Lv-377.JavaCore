package hw6.softserve;

public class Eagle extends FlyingBird {

	public Eagle(String feathers, String layEggs) {
		super(feathers, layEggs);
		
	}

	@Override
	public void fly() {
		System.out.println("[Eagle]");
		System.out.println("Flyes: Yes");
		System.out.println("Feathers: " + getFeathers());
		System.out.println("Lay eggs: " + getLayEggs());
		
	}
	

}
