package hw4.softserve;

public class Main {

	public static void main(String[] args) {
		
//Setting variables		
		Dog dogo1 = new Dog("Fido", Breed.GREYHOUND, 3);
		Dog dogo2 = new Dog("Hatico", Breed.NEWFOUNDLAND, 5);
		Dog dogo3 = new Dog("Fido" ,Breed.BEAGLE, 10);

//Checking name duplicates..
		
		if (dogo1.equals(dogo2) || dogo1.equals(dogo3) || dogo2.equals(dogo3)) {
		System.out.println("Attention! Dogs with the same names, check it out: ");
		System.out.println(dogo1);
		System.out.println(dogo2);
		System.out.println(dogo3);
		}
		
//Finding the oldest one..
		if (dogo1.getAge() > dogo2.getAge() && dogo1.getAge() > dogo3.getAge()){
			System.out.println("The oldest one..");
			System.out.println(dogo1);
		}else if (dogo2.getAge() > dogo1.getAge() && dogo2.getAge() > dogo3.getAge()){
			System.out.println("The oldest one..");
			System.out.println(dogo2);
		}else if (dogo3.getAge() > dogo1.getAge() && dogo3.getAge() > dogo2.getAge()){
			System.out.println("The oldest one..");
			System.out.println(dogo3);
		}else{
			System.out.println("We have more than one oldest dog, check it out.. ");
			System.out.println(dogo1);
			System.out.println(dogo2);
			System.out.println(dogo3);
		}
	}

}
