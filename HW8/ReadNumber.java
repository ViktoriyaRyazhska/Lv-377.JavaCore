import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadNumber {

	public static int readNumber(int start, int end) throws NumberFormatException, IOException, NumberOutOfRange {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter digit in the range [" + start + ":" + end +"]");
		int number = Integer.parseInt(br.readLine());
		if ((number >= start)&&(number <= end)) {
			br.close();
			return number;
		} else {
			br.close();
			throw new NumberOutOfRange("The number is out of range [" + start + ":" + end +"]");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			System.out.println(readNumber(10, 20));
		} catch (NumberFormatException | IOException | NumberOutOfRange e) {
			e.printStackTrace();
		}

	}

}
