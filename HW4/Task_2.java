package HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import HW4.Dog.Breed;

public class Task_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Dog Dog1 = new Dog();
		Dog1.setName("Rex");
		Dog1.setAge(6);
		Dog1.breed = Breed.Boxer;
		
		Dog Dog2 = new Dog("Lessi");
		Dog2.setAge(2);
		Dog2.breed = Breed.Bulldog;
		
		Dog Dog3 = new Dog("Rex", 3);
		Dog3.breed = Breed.Collie;
		
		Dog Dog4 = new Dog();		
		System.out.println("Write dog's name: ");
		Dog4.setName(br.readLine());
		System.out.println("Write dog's age: ");
		Dog4.setAge(Integer.parseInt(br.readLine()));
		System.out.println("Choos breed of dog (1-3): ");
		int type = Integer.parseInt(br.readLine());
		
		switch (type) {
		case 1:
			Dog4.breed = Breed.Boxer; break;
		case 2:
			Dog4.breed = Breed.Bulldog; break;
		case 3:
			Dog4.breed = Breed.Collie; break;
		default:
			System.out.println("No type!");
			System.exit(0);
		}
		
		System.out.println(Dog1);
		System.out.println(Dog2);
		System.out.println(Dog3);
		System.out.println(Dog4);
		
		System.out.println();
		System.out.println("Same dog's name:");
		if (Dog1.equals(Dog2) || Dog1.equals(Dog3) || Dog1.equals(Dog4)) {
			System.out.println(Dog1);
		}
		if (Dog2.equals(Dog1) || Dog2.equals(Dog3) || Dog2.equals(Dog4)) {
			System.out.println(Dog2);
		}
		if (Dog3.equals(Dog1) || Dog3.equals(Dog2) || Dog3.equals(Dog4)) {
			System.out.println(Dog3);
		}
		if (Dog4.equals(Dog1) || Dog4.equals(Dog2) || Dog4.equals(Dog3)) {
			System.out.println(Dog4);
		}
		
		System.out.println();
		System.out.println("The oldest dog:");
		if (Dog1.getAge()>=Dog2.getAge() && Dog1.getAge()>=Dog3.getAge() && Dog1.getAge()>=Dog4.getAge()) {
			System.out.println(Dog1);
		}
		if (Dog2.getAge()>=Dog1.getAge() && Dog2.getAge()>=Dog3.getAge() && Dog2.getAge()>=Dog4.getAge()) {
			System.out.println(Dog2);
		}
		if (Dog3.getAge()>=Dog1.getAge() && Dog3.getAge()>=Dog2.getAge() && Dog3.getAge()>=Dog4.getAge()) {
			System.out.println(Dog3);
		}
		if (Dog4.getAge()>=Dog1.getAge() && Dog4.getAge()>=Dog2.getAge() && Dog4.getAge()>=Dog3.getAge()) {
			System.out.println(Dog4);
		}
		
	}
}