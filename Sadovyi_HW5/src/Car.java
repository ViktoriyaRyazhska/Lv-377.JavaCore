
public class Car {
	private  String type;
	private  int year;
	private  int cap;
	
	
	
	Car(String type, int year, int cap) {
		this.type=type;
		this.year=year;
		this.cap=cap;		
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public int getCap() {
		return cap;
	}



	public void setCap(int cap) {
		this.cap = cap;
	}



	@Override
	public String toString() {
		return "Car [type=" + type + ", year=" + year + ", cap=" + cap + "]";
	}
	
	
	

}
