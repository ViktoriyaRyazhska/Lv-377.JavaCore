package person;

public class Student extends Person{
	
	private int curs;
	public final String TYPE_PERSON = "Student";
	
	
	public Student() {
		super();
	}


	public Student(String name, int curs) {
		super(name);
		this.curs = curs;
	}

	

	public int getCurs() {
		return curs;
	}


	public void setCurs(int curs) {
		this.curs = curs;
	}


	public String getTYPE_PERSON() {
		return TYPE_PERSON;
	}


	@Override
	public void print() {
		System.out.println("I am a " + TYPE_PERSON);
		
	}



}
