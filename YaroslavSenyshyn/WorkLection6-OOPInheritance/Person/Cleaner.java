package OOPInheritance;

public class Cleaner extends Staff {
	
	@Override
	public int Sallary() {
		return 100;
	}

	@Override
	public void setName(String name) {
		super.setName(name);
	}
	
	@Override
	public void print() {
		super.print();
		System.out.print(" cleaner, my name "+ getName()+", my sallary: "+Sallary());
	}
}
