package HW6;

public class Penguin extends NonFlyingBird {
	public void print() {
	    System.out.print("Penguin: ");
	}
	
	public Penguin () {
		this.setFeathers(false);
		this.setLayEggs(true);
	}	
}