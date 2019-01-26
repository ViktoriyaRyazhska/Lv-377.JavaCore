
public class Eagle extends FlyingBird {

	public Eagle() {
		super(true, true);
	}
	

	@Override
	public void fly() {
		System.out.println("The Eagle flyes");
		
		
		
	}


	@Override
	public String toString() {
		return "Eagle [isFeathers()=" + isFeathers() + ", isLayEggs()=" + isLayEggs() + ", getClass()=" + getClass();
	}

}
