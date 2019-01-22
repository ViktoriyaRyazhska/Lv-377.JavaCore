package OOPInheritance;

public class Teacher extends Staff {
	@Override
	public int Sallary() {
		return 160;
	}
	
	@Override
	public void setName(String name) {
		super.setName(name);
	}
	
	@Override
	public void print() {
		super.print();
		System.out.print(" teacher, my name "+ getName()+", my sallary: "+Sallary());
	}
}
