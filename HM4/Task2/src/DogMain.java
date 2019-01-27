
public class DogMain {
	public static void main(String[] args) {
		Dog dog1 = new Dog("Fill", Dog.Breed.Azawakh.name(), 3);
		Dog dog2 = new Dog("Butch", Dog.Breed.Barbet.name(), 2);
		Dog dog3 = new Dog("Clarc", Dog.Breed.Beagle.name(), 4);

		int sameName = 0;
		sameName += dog1.getName() == dog2.getName() ? 1 : 0;
		sameName += dog1.getName() == dog3.getName() ? 1 : 0;
		sameName += dog2.getName() == dog3.getName() ? 1 : 0;
		if(sameName>0) {
			System.out.println(" There are similar dogs");
		}else {
			System.out.println(" There are no similar dogs");
		}
		
	System.out.println("Oldest Dog is "+Dog.oldestDog(Dog.oldestDog(dog1, dog2),dog3).getName());
		
	}
}
