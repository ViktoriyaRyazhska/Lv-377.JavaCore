package HW6;

public abstract class Bird {
	public boolean feathers;
	
	public boolean isFeathers() {
		return feathers;
	}
	
	public void setFeathers(boolean feathers) {
		this.feathers = feathers;
	}
	
	public boolean layEggs;
	
	public boolean isLayEggs() {
		return layEggs;
	}
	
	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}
	
	abstract boolean fly();
	
	abstract void print();
}