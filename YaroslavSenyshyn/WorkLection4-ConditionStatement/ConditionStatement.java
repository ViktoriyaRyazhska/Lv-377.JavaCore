package HW3ConditionStatement;

public class ConditionStatement {

	public ConditionStatement() {
	}

	public static void checkFloat(float a, float b, float c) {
		if (a >= -5 && a <= 5 && b >= -5 && b <= 5 && c >= -5 && c <= 5) {
			System.err.println("All number belong to the range [-5,5]");
		} else {
			System.err.println("One or more number is not belong to the range [-5,5]");
		}
	}

	public static void checkInt(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("Max " + a);
			if (b < c) {
				System.out.println("Min " + b);
			} else {
				System.out.println("Min " + c);
			}
		} else if (b > a && b > c) {
			System.out.println("Max " + b);
			if (a < c) {
				System.out.println("Min " + a);
			} else {
				System.out.println("Min " + c);
			}
		} else if (c > a && c > b) {
			System.out.println("Max " + c);
			if (a < b) {
				System.out.println("Min " + a);
			} else {
				System.out.println("Min " + b);
			}
		}
	}

	public enum httpError {
		ERROR400("Bad Request"), ERROR401("Unauthorized"), ERROR402("Payment Required"), ERROR403("Forbidden"),
		ERROR404("Not Found");

		private final String info;

		public String getInfo() {
			return info;
		}

		private httpError(String info) {
			this.info = info;

		}

	}

	public static void infoErrorHttp(String request) {

		switch (request.toUpperCase()) {
		case "ERROR400":
			System.out.println(httpError.ERROR400.info);
			break;
		case "ERROR401":
			System.out.println(httpError.ERROR401.info);
			break;
		case "ERROR402":
			System.out.println(httpError.ERROR402.info);
			break;
		case "ERROR403":
			System.out.println(httpError.ERROR403.info);
			break;
		case "ERROR404":
			System.out.println(httpError.ERROR404.info);
			break;

		default:
			System.out.println("Error, don't have info about your request");
			break;
		}

	}

}
/*
 * 1.Solve the next tasks:​ read 3 float numbers and check: are they all belong
 * to the range [-5,5];​ read 3 integer numbers and write max and min of them;​
 * read number of HTTP Error (400, 401,402, ...) and write the name of this
 * error (Declare enum HTTPError)​ 2.Сreate class Dog with fields name, breed,
 age. ​ Declare enum for field breed. ​ 
  Create 3 instances of type Dog. ​
  Check if there is no two dogs with the same name. ​ Display the name and the
  kind of the oldest dog. ​ 3.*Add Unit Tests to each task, publish code on
  GitHub
 */