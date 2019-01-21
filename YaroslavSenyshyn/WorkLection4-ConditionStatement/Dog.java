package HW3ConditionStatement;

public class Dog {
	private String name;
	private breed breed;
	private int age;

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

	public Dog(String name, HW3ConditionStatement.Dog.breed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	enum breed {
		AKITA, POINTER, DALMATAIN, COLLIE;
	}

	public static void checkOldest(Dog[] dogs) {
		Dog[] temp = new Dog[1];
		temp[0] = dogs[0];
		for (int i = 1; i < dogs.length; i++) {
			if (dogs[i].age > dogs[0].age) {
				temp[0] = dogs[i];
			}
		}
		System.out.println("oldest dog: " + temp[0]);
	}

	public static void chechName(Dog[] dogs) {
/*
 /////with out equals///////
  
		for (int i = 0; i < dogs.length - 1; i++) {
			for (int j = i + 1; j < dogs.length; j++) {
				if (dogs[i].name == dogs[j].name) {
					System.out.println("Is dogs with the same name");
					break;
				}
				if (i == dogs.length - 2 && j == dogs.length - 1 && dogs[i].name != dogs[j].name) {
					System.out.println("Isn't dogs with the same name");
				}
			}
		}
*/
		for (int i = 0; i < dogs.length-1; i++) {
			for (int j = i+1; j < dogs.length; j++) {
				if (dogs[i].equals(dogs[j])) {
					System.out.println("Is dogs with the same name");
					break;
				} 
				if (i == dogs.length-2 && j == dogs.length-1) {
					System.out.println("Isn't dogs with the same name");
				}  
			}
		}
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

	@Override
	public String toString() {
		return "Name = " + name + ", Breed = " + breed;
	}

}