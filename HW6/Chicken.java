package HW6;

public class Chicken extends NonFlyingBird {
	public void print() {
	    System.out.print("Chicken: ");
	}
	
	public Chicken () {
		this.setFeathers(true);
		this.setLayEggs(true);
	}
}