
public class Penguin extends NonFlyingBird {

	public Penguin() {
		super(false, true);
	}
	

	@Override
	public void fly() {
		System.out.println("Penguins can't fly");
	}


	@Override
	public String toString() {
		return "Penguin [isFeathers()=" + isFeathers() + ", isLayEggs()=" + isLayEggs() + ", getClass()=" + getClass();
	}

	
	
}
