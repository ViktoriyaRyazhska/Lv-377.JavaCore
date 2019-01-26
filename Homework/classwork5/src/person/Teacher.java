package person;

public class Teacher extends Staff{
	public final String TYPE_PERSON = "Teacher";
	
	public Teacher(String name) {
		super(name);
	}



	@Override
	public int salary() {
		return 1000;
	}

	@Override
	public void print() {
		System.out.println("I am a " + TYPE_PERSON);
		
	}


	
}
