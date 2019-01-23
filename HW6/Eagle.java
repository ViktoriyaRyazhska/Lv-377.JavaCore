package HW6;

public class Eagle extends FlyingBird {
	public void print() {
	    System.out.print("Eagle: ");
	}
	
	public Eagle () {
		super.setFeathers(true);
		super.setLayEggs(true);
	}

	@Override
	boolean fly() {
		return true;
	}
}