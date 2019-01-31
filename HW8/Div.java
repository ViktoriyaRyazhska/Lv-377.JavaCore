
public class Div {

	public static double div(double a, double b) throws ArithmeticException {
		if (b != 0) {
			return a/b;
		} else {
			throw new ArithmeticException("b == 0");
		}
	}

	public static void main(String[] args) {

		try {
			System.out.println(div(10.0, 5.0));
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(div(10.0, 0));
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}		
		
		//System.out.println(div(10.0, 0));
		
		try {
			System.out.println(div(0, 5.0));
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
