package HW3ConditionStatement;

import HW3ConditionStatement.Dog.breed;

public class ConditionStatementMain {

	public static void main(String[] args) {	
		ConditionStatement.checkFloat((float) 3.1, 0, -1);
		ConditionStatement.checkInt(9, 1, 4);
		ConditionStatement.infoErrorHttp("Error404");
		
		Dog[] dogs = new Dog[3];
		dogs[0] = new Dog("Rokki", breed.POINTER, 3);
		dogs[1] = new Dog("Rex", breed.AKITA, 5);
		dogs[2] = new Dog("Ronni", breed.DALMATAIN, 2);
		
		Dog.checkOldest(dogs);
		Dog.chechName(dogs);
		
		
		
	}

}
