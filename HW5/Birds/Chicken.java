
public class Chicken extends NonFlyingBird {

	public Chicken() {
		super(true, true);
	}
	

	@Override
	public void fly() {
		System.out.println("Chickens can't fly");
	}


	@Override
	public String toString() {
		return "Chicken [isFeathers()=" + isFeathers() + ", isLayEggs()=" + isLayEggs() + ", getClass()=" + getClass();
	}

	
	
}
