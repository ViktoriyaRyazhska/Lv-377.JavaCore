package Home_work_4_Conditions.Dog;

public class Dog {

	/*
	 * Ñreate class Dog with fields name, breed, age. Declare enum for field breed.
	 * Create 3 instances of type Dog. Check if there is no two dogs with the same
	 * name. Display the name and the kind of the oldest dog.
	 */

	String name;
	DogBreeds breed;
	int age;

	public Dog(String name, DogBreeds breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public Dog() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DogBreeds getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}

	public static void main(String[] args) {

		Dog[] array = { new Dog("Mushka", DogBreeds.BULLDOG, 7), new Dog("Rex", DogBreeds.COLLIE, 9),
				new Dog("Rex", DogBreeds.GOLDADOR, 3) };

		Dog theOldest = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i].getAge() > theOldest.getAge()) {
				theOldest = array[i];
			}
		}
		System.out.println("The oldest dog is " + theOldest);

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].getName().equals(array[j].getName())) {
					System.out.println("Dogs " + array[i] + " and " + array[j] + "have the same names.");
					break;
					// How to stop the program, when it finds at least one coincidence? 
					// Break doesn't help in such cases, because I use two loops in the same time.
				} else {
					System.out.println("There aren't dogs with the same names.");
				}
			}
		}
		
		
		
		/* if ( (array[0].getName().equals(array[1].getName()) ||
		 (array[1].getName().equals(array[2].getName())) ||
		 ((array[0].getName().equals(array[1].getName())))) ) {
		 System.out.println("There are dogs, which have the same names."); } 
		 else {
		 System.out.println("There aren't dogs with the same names."); }*/
		
		// We can compare dogs' names in such way. But I believe, it's just a hardcode.
		// Because if we have 1 million of dogs, nobody would never write such comparing if-else statement.
	}
}