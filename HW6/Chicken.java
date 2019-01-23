package HW6;

public class Chicken extends NonFlyingBird {
	public void print() {
	    System.out.print("Chicken: ");
	}
	
	public Chicken () {
		super.setFeathers(true);
		super.setLayEggs(true);
	}
	
	@Override
	boolean fly() {
		return false;
	}	
}