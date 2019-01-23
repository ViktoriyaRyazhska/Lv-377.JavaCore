package HW6;

public class Penguin extends NonFlyingBird {
	public void print() {
	    System.out.print("Penguin: ");
	}
	
	public Penguin () {
		super.setFeathers(false);
		super.setLayEggs(true);
	}
	
	@Override
	boolean fly() {
		return false;
	}	
}