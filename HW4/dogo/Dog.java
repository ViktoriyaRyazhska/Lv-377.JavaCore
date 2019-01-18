package hw4.softserve;

public class Dog {
	private String name;
	private Breed breed;
	private int age;
	
//Getters and setters	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Breed getBreed() {
		return breed;
	}
	public void setBreed(Breed breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
		
//Constructors
	public Dog(String name, Breed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
//To string
	@Override
	public String toString() {
		return "Dog [Name: " + getName() + ", Breed: " + getBreed() + ", Age: " + getAge() + "]";
	}
	
//Hash and equals
	
	@Override
	public int hashCode() {
		final int prime = 1;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
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

	
	

}
