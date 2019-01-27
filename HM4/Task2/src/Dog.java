
public class Dog {
	private String name;
	private String breed;
	private int age;

	enum Breed {
		Azawakh, Beagle, Barbet, Bloodhound;
	}

	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static Dog oldestDog(Dog old, Dog young) {
		if (old.getAge() > young.getAge()) {
			return old;
		} else {
			return young;
		}

	}
}
