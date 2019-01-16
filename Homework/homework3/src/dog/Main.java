package dog;

public class Main {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Sharik", Breed.Boxer, 15);
		Dog dog2 = new Dog("Tuzik", Breed.LabradorRetriever, 10);
		Dog dog3 = new Dog("Dobryachok", Breed.Beagle, 7);
		
		System.out.println(dog1 + ", " + dog2 + ", " + dog3);
		if(dog1.equals(dog2) || dog1.equals(dog3) || dog2.equals(dog3)) {
			System.out.println("Is dogs with the same name");
		}else {
			System.out.println("Isn't dogs with the same name");
		}
		
		System.out.println("Info  the oldest dog : ");
		if(dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
			System.out.println("The oldest dog is : " + dog1.getName() + " - " + dog1.getBreed());
		}else if(dog2.getAge() > dog3.getAge()) {
			System.out.println("The oldest dog is : " + dog2.getName() + " - " + dog2.getBreed());
		}else {
			System.out.println("The oldest dog is : " + dog3.getName() + " - " + dog3.getBreed());
		}
	}

}
