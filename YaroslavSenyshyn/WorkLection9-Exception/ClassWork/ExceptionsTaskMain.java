package Exceptions;

public class ExceptionsTaskMain {

	public static void main(String[] args) throws MyExceptions {
		try {
			System.out.println(ExceptionsTask.squareRentangle(3, 2));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(ExceptionsTask.squareRentangle(3, 2));
		try {
			System.out.println(ExceptionsTask.squareRentangle(-3, 2));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Plant p1 = new Plant("tree", "white", 90);
		} catch (MyExceptions e) {
			e.printStackTrace();
		}
		try {
			Plant p2 = new Plant("rose", "black", 90);

		} catch (MyExceptions e) {
			e.printStackTrace();
		}
		Plant p = null;
		try {
			p = new Plant("rose", "white", 90);
			System.out.println(p);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
