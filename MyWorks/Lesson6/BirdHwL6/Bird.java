package BirdHwL6;

public abstract class Bird {
	
	protected boolean feathers, layEggs;
	
	protected abstract void canFly();
	
	protected void getType() {}
	
	public boolean isFeathers() {
	        return feathers;
	    }

	public boolean isLayEggs() {
	        return layEggs;
	    }

	@Override
	public String toString() {
		return "Attributes [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}
	
	

}
