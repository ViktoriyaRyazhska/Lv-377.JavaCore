import java.io.BufferedReader;
import java.io.IOException;

public class Task8 {

	public static void Start (BufferedReader br) {
		long num=0;
		System.out.println("Input num");
		try {
			num = Long.parseLong( br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Input num");
		System.out.println(Long.toString(num));
	}
}
