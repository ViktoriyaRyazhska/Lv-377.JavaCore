import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int minNumber = +2147483647;
		int maxNumber = -2147483648;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter 3 float numbers: ");
		for(int i = 0; i<3; i++) {
			System.out.println("number "+ i + ": ");
			float number = Float.parseFloat(br.readLine());
			if ((number >= -5) && (number <= 5)) {
				System.out.println("The number " + number + " belongs to the range [-5,5];");
			}
			else {
				System.out.println("The number " + number + " doesn't belong to the range [-5,5];");
			}
		}
		
		System.out.println("Please enter 3 float numbers to compare: ");
		for (int i = 0; i<3; i++) {
			System.out.println("number " + i + ": ");
			int numberToCompare = Integer.parseInt(br.readLine());
			if (numberToCompare < minNumber) {
				minNumber = numberToCompare;
			}
			if (numberToCompare > maxNumber) {
				maxNumber = numberToCompare;
			}
		}
		System.out.println("The minimum number is : " + minNumber);
		System.out.println("The maximum number is : " + maxNumber);

	}

}
