public class Dog {
	private String name;
	private DogBreed breed;
	private int age;

	Dog() {
		this.name = "nonamed";
		this.age = -1;
	}

	Dog(String name) {
		this.name = name;
		this.age = -1;
	}

	Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	Dog (String name, int age, String breed) {
		this.name = name;
		this.age = age;
		this.breed = DogBreed.asDogBreed(breed);
	}



	public static void main(String[] args) {
		Dog d1 = new Dog("Tuzik", 4, "germansheperd");
		Dog d2 = new Dog("Bim", 2, "bulldog");
		Dog d3 = new Dog("Bilka", 7, "goldenretriever");
		
		if ((d1.name.equals(d2.name))||(d2.name.equals(d3.name))||(d1.name.equals(d3.name))){
			System.out.println("There are dogs with same names.");
		} else {
			System.out.println("There aren't dogs with same names.");
		}
		
		int numberOfOldestDog = -1;
		numberOfOldestDog = (d1.age > d2.age)? 1: 2;
		if (d3.age > numberOfOldestDog) {
			numberOfOldestDog = 3;
		}
		
		switch (numberOfOldestDog) {
		case 1: 
			System.out.println("The oldest dog's name is: " + d1.name + ", age: " + d1.age + ", breed: " + d1.breed.name());
			break;
		case 2: 
			System.out.println("The oldest dog's name is: " + d2.name + ", age: " + d2.age + ", breed: " + d2.breed.name());
			break;
		case 3: 
			System.out.println("The oldest dog's name is: " + d3.name + ", age: " + d3.age + ", breed: " + d3.breed.name());
			break;
		default:
			System.out.println("Something went wrong");
			break;
		}

	}
}

enum DogBreed {
	LabradorRetriever, GermanShepherd, GoldenRetriever, FrenchBulldog, Bulldog;

	public static DogBreed asDogBreed(String str) {
		    for (DogBreed db : DogBreed.values()) {
		        if (db.name().equalsIgnoreCase(str))
		            return db;
		    }
		    return null;
		}
}
