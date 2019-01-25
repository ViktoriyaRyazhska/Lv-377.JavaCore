package HW6;

public class Eagle extends FlyingBird {
	public void print() {
	    System.out.print("Eagle: ");
	}
	
	public Eagle () {
		this.setFeathers(true);
		this.setLayEggs(true);
	}
}