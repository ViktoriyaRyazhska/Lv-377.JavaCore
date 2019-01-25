package HW6;

public class Swallow extends FlyingBird {
	public void print() {
	    System.out.print("Swallow: ");
	}
	
	public Swallow () {
		this.setFeathers(true);
		this.setLayEggs(true);
	}	
}