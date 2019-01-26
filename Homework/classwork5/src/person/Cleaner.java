package person;

public class Cleaner extends Staff{
	public Cleaner(String name) {
		super(name);
	}

	public final String TYPE_PERSON = "Cleaner";

	
	@Override
	public int salary() {
		return 500;
	}

	@Override
	public void print() {
		System.out.println("I am a " + TYPE_PERSON);
	}


}
