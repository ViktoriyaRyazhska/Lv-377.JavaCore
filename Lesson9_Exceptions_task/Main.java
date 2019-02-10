package Lesson9_Exceptions_task;

public class Main {

	// Create a class Plant, which includes fields int size, Color color and Type
	// type, and constructor where these fields are initialized. Color and type are
	// Enum. Override the method toString( ). Create classes ColorException and
	// TypeException and describe there all possible colors and types of plants. In
	// the method main create an array of five plants. Check to work your
	// exceptions.

	public static void main(String[] args) throws TypeException, ColorException {

		Plant[] array = new Plant[3];
		
			try {
				array[0] = new Plant(27, "white", "cactus");
			} catch (ColorException | TypeException e1 ) {
				e1.printStackTrace();
				System.out.println(e1.getMessage());
			}

			try {
				array[1] = new Plant(12, "red", "tulipan");
			} catch (ColorException | TypeException e1 ) {
				e1.printStackTrace();
				System.out.println(e1.getMessage());
			}
			
			try {
				array[2] = new Plant(15, "yellow", "rose");
			} catch (ColorException | TypeException e1 ) {
				e1.printStackTrace();
				System.out.println(e1.getMessage());
			}
		
		System.out.println(array[2].toString());
			
		System.out.println("It works!");

	}

}
