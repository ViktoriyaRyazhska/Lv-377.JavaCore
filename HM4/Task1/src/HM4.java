import java.util.Scanner;

public class HM4 {
	private float numb1;
	private float numb2;
	private float numb3;
	private int inumb1;
	private int inumb2;
	private int inumb3;

	public float inPut1(Scanner in) {
		System.out.println("Are 3 numbers belong to range [-5;5]?");
		System.out.println("Input number 1");
		numb1 = in.nextFloat();
		return numb1;
	}

	public float inPut2(Scanner in) {
		System.out.println("Input number 2");
		numb2 = in.nextFloat();
		return numb2;
	}

	public float inPut3(Scanner in) {
		System.out.println("Input number 3");
		numb3 = in.nextFloat();
		return numb3;
	}

	public int inPuti1(Scanner in) {
		System.out.println("Input 3 numbers and found max and min of them");
		System.out.println("Input number 1");
		inumb1 = in.nextInt();
		return inumb1;
	}

	public int inPuti2(Scanner in) {
		System.out.println("Input number 2");
		inumb2 = in.nextInt();
		return inumb2;
	}

	public int inPuti3(Scanner in) {
		System.out.println("Input number 3");
		inumb3 = in.nextInt();
		return inumb3;
	}

	public void check1() {
		if (numb1 <= 5 && numb1 >= -5)
			System.out.println(numb1);
		if (numb2 <= 5 && numb2 >= -5)
			System.out.println(numb2);
		if (numb3 <= 5 && numb3 >= -5)
			System.out.println(numb3);

	}

	public void maxAndMin() {
		if (inumb1 > inumb2 && inumb1 > inumb3)
			System.out.println("max=" + inumb1);
		if (inumb2 > inumb1 && inumb2 > inumb3)
			System.out.println("max=" + inumb2);
		if (inumb3 > inumb2 && inumb3 > inumb1)
			System.out.println("max=" + inumb3);
		if (inumb1 < inumb2 && inumb1 < inumb3)
			System.out.println("min=" + inumb1);
		if (inumb2 < inumb1 && inumb2 < inumb3)
			System.out.println("min=" + inumb2);
		if (inumb3 < inumb2 && inumb3 < inumb1)
			System.out.println("min=" + inumb3);

	}

	public enum HTTPError {
		Bad_Request, Unauthorized, Payment_Required, Forbidden;
	}

	public void Error(String Error) {
		HTTPError http;
		switch (Error) {
		case "400":
			http = HTTPError.Bad_Request;
			System.out.println(http);
			break;
		case "401":
			http = HTTPError.Unauthorized;
			System.out.println(http);
			break;
		case "402":
			http = HTTPError.Payment_Required;
			System.out.println(http);
			break;
		case "403":
			http = HTTPError.Forbidden;
			System.out.println(http);
			break;
		}

	}
}
