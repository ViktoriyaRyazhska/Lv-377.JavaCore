import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetDayOfMonth {

	public static void main(String[] args) throws NumberFormatException, IOException {
		DaysInMonth dim = new DaysInMonth();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of month please: ");
		int number = Integer.parseInt(br.readLine());
		
		if(number >= 0 && number <= dim.getDaysArray().length) {
			System.out.println(dim.getDaysArray()[number-1]);
		} else {
			System.out.println("Invalid number");
		}

	}

}
