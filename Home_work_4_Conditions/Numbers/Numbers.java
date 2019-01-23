package Home_work_4_Conditions.Numbers;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {

		// read 3 float numbers and check: are they all belong to the range [-5,5];

		System.out.println("Please, enter three numbers.");

		Scanner sc = new Scanner(System.in);
		float firstFloatNumber = sc.nextFloat();
		float secondFloatNumber = sc.nextFloat();
		float thirdFloatNumber = sc.nextFloat();

		float[] array = { firstFloatNumber, secondFloatNumber, thirdFloatNumber };

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= -5 && array[i] <= 5) {
				System.out.println("The number " + array[i] + " is in the range [-5; 5]");
			} else {
				System.out.println("The number " + array[i] + " is out of the range [-5; 5]");
			}
		}

		// read 3 integer numbers and write max and min of them;

		System.out.println("Please, enter three numbers for selecting the min and max values");

		int firstIntNumber = sc.nextInt();
		int secondIntNumber = sc.nextInt();
		int thirdIntNumber = sc.nextInt();

		int max = 0;
		int min = 0;

		if (firstIntNumber > secondIntNumber && firstIntNumber > thirdIntNumber) {
			max = firstIntNumber;
		}
		if (firstIntNumber < secondIntNumber && firstIntNumber < thirdIntNumber) {
			min = firstIntNumber;
		}

		if (secondIntNumber > firstIntNumber && secondIntNumber > thirdIntNumber) {
			max = secondIntNumber;
		}
		if (secondIntNumber < firstIntNumber && secondIntNumber < thirdIntNumber) {
			min = secondIntNumber;
		}

		if (thirdIntNumber > firstIntNumber && thirdIntNumber > secondIntNumber) {
			max = thirdIntNumber;
		}
		if (thirdIntNumber < firstIntNumber && thirdIntNumber < secondIntNumber) {
			min = thirdIntNumber;
		}

		System.out.println("The max value is " + max);
		System.out.println("The min value is " + min);

		/*
		 * For such easy task we can use if-else statement, but for real programs with
		 * big data it'd be better to use array and for loop
		 * 
		 * int[] array = {firstIntNumber, secondIntNumber, thirdIntNumber};
		 * 
		 * int max = array1[0]; int min = array1[0];
		 * 
		 * for (int i = 0; i < array.length; i++) { if (array[i] > max) { max =
		 * array1[i]; } if (array[i] < min) { min = array[i]; }
		 * 
		 * } System.out.println(min); System.out.println(max);
		 */

		// read number of HTTP Error (400, 401,402, ...) and write the name of this
		// error (Declare enum HTTP Error)

		System.out.println("Please, enter the error number.");

		int firstError = sc.nextInt();

		if (firstError == httpErrors.PAYMENT_REQUIRED.getErrorNumber()) {
			System.out.println(httpErrors.PAYMENT_REQUIRED.getErrorExplanation());
		} else if (firstError == httpErrors.FORBIDDEN.getErrorNumber()) {
			System.out.println(httpErrors.FORBIDDEN.getErrorExplanation());
		} else if (firstError == httpErrors.NOT_FOUND.getErrorNumber()) {
			System.out.println(httpErrors.NOT_FOUND.getErrorExplanation());
		} else if (firstError == httpErrors.METHOD_NOT_ALLOWED.getErrorNumber()) {
			System.out.println(httpErrors.METHOD_NOT_ALLOWED.getErrorExplanation());
		} else if (firstError == httpErrors.NOT_ACCEPTABLE.getErrorNumber()) {
			System.out.println(httpErrors.NOT_ACCEPTABLE.getErrorExplanation());
		} else if (firstError == httpErrors.PROXY_AUTHENTICATION_REQUIRED.getErrorNumber()) {
			System.out.println(httpErrors.PROXY_AUTHENTICATION_REQUIRED.getErrorExplanation());
		} else if (firstError == httpErrors.REQUEST_TIMEOUT.getErrorNumber()) {
			System.out.println(httpErrors.REQUEST_TIMEOUT.getErrorExplanation());
		} else if (firstError == httpErrors.CONFLICT.getErrorNumber()) {
			System.out.println(httpErrors.CONFLICT.getErrorExplanation());
		} else if (firstError == httpErrors.LENGTH_REQUIRED.getErrorNumber()) {
			System.out.println(httpErrors.LENGTH_REQUIRED.getErrorExplanation());
		} else if (firstError == httpErrors.PRECONDITION_FAILED.getErrorNumber()) {
			System.out.println(httpErrors.PRECONDITION_FAILED.getErrorExplanation());
		} else if (firstError == httpErrors.REQUEST_ENTITY_TOO_LARGE.getErrorNumber()) {
			System.out.println(httpErrors.REQUEST_ENTITY_TOO_LARGE.getErrorExplanation());
		} else if (firstError == httpErrors.REQUEST_URI_TOO_LONG.getErrorNumber()) {
			System.out.println(httpErrors.REQUEST_URI_TOO_LONG.getErrorExplanation());
		} else if (firstError == httpErrors.UNSUPPORTED_MEDIA_TYPE.getErrorNumber()) {
			System.out.println(httpErrors.UNSUPPORTED_MEDIA_TYPE.getErrorExplanation());
		} else if (firstError == httpErrors.REQUESTED_RANGE_NOT_SATISFIABLE.getErrorNumber()) {
			System.out.println(httpErrors.REQUESTED_RANGE_NOT_SATISFIABLE.getErrorExplanation());
		} else if (firstError == httpErrors.EXPECTATION_FAILED.getErrorNumber()) {
			System.out.println(httpErrors.EXPECTATION_FAILED.getErrorExplanation());
		} else {
			System.out.println("Wrong error number");
		}
		sc.close();
	}
}
