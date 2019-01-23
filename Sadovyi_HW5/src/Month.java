import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {

	static int day[]= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter num of month");
		int n=Integer.parseInt(br.readLine());
		System.out.println(day[n-1]);
	}

}
