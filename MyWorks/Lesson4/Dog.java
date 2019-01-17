package Lesson4;

public class Dog {

	String name;
	int age;
	Breed dogBreed;

	public Dog(String name, int age, Breed dogBreed) {
		super();
		this.name = name;
		this.age = age;
		this.dogBreed = dogBreed;
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

	public void setAge(byte age) {
		this.age = age;
	}

	public Breed getDogBreed() {
		return dogBreed;
	}

	public void setDogBreed(Breed dogBreed) {
		this.dogBreed = dogBreed;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", dogBreed=" + dogBreed + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		Dog d1 = new Dog("SPYKE", 2, Breed.BEAGLE);
		Dog d2 = new Dog("LINDA", 6, Breed.BOXER);
		Dog d3 = new Dog("JONNY", 1, Breed.DOBERMAN);

		if ((d1.getAge() > (d2.getAge())) && (d1.getAge() > (d3.getAge()))) {
			System.out.println(d1.toString());
		} else if ((d2.getAge() > (d1.getAge())) && (d2.getAge() > (d3.getAge()))) {
			System.out.println(d2.toString());
		} else if ((d3.getAge() > (d1.getAge())) && (d3.getAge() > (d2.getAge()))) {
			System.out.println(d3.toString());
		}
		
		if ((d1.equals(d2))||(d1.equals(d2))||(d2.equals(d3))) {
			System.out.println("There are minimum 2 dogs with the same names!");
		}
		else System.out.println("There are no dogs with the same name");
		
//		System.out.println(d1.equals(d2));
//		System.out.println(d1.equals(d2));
//		System.out.println(d2.equals(d3));
		
	
	}

}

enum Breed {
	BEAGLE, BOXER, DOBERMAN;
}
