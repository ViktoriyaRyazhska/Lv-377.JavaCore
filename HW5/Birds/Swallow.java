
public class Swallow extends FlyingBird {

	public Swallow() {
		super(true, true);
	}

	
	@Override
	public void fly() {
		System.out.println("The Swallow flyes");

	}


	@Override
	public String toString() {
		return "Swallow [isFeathers()=" + isFeathers() + ", isLayEggs()=" + isLayEggs() + ", getClass()=" + getClass();
	}

	
	
}
