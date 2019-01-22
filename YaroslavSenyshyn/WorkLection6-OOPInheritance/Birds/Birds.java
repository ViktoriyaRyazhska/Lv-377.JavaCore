package OOPInheritanceHW;

public abstract class Birds {
	private String feathers;
	private String layEggs;
	
	public String getFeathers() {
		return feathers;
	}
	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}
	public String getLayEggs() {
		return layEggs;
	}
	public void setLayEggs(String layEggs) {
		this.layEggs = layEggs;
	}

	abstract void fly();
	
	
	
}
