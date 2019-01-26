
public abstract class Bird {
	private boolean feathers;
	private boolean layEggs;
	
	
	

	public Bird() {
	}

	public Bird(boolean feathers, boolean layEggs) {
		super();
		this.feathers = feathers;
		this.layEggs = layEggs;
	}



	protected boolean isFeathers() {
		return feathers;
	}

	protected void setFeathers(boolean feathers) {
		this.feathers = feathers;
	}

	protected boolean isLayEggs() {
		return layEggs;
	}

	protected void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}
	
	public abstract void fly();

}
