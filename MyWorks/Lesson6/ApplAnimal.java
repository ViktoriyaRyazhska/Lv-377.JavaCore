package Lesson6;

public class ApplAnimal {

	public static void main(String[] args) {
		
		Animal animal[]=new Animal[4];
		
		animal[0] = new Cat();
		animal[1] =	new Cat();
		animal[2] = new Dog();
		animal[3] =	new Dog();
		
		
		for(int i=0; i<animal.length; i++) {
			System.out.print(i + " ");
			Dog.voice();
			System.out.print(i + " ");
			Cat.voice();
		
		} 
		
		
	

	}

}
