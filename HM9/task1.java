import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManiDiv {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 do {
		try {
			System.out.println("input a");
			a = Integer.parseInt(bf.readLine());
			System.out.println("input b, it's  shouldn't be 0");
			b = Integer.parseInt(bf.readLine());
		} catch (IOException e) {
			System.out.println("Wrong");
			e.getStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("Its not a number");
			e.getStackTrace();
		}
		try {
		System.out.println(div(a, b));
		}catch(ArithmeticException ae) {
			System.out.println("dividing on 0");
			ae.getStackTrace();
		}
		 }while (b==0);
		
	}

	public static int div(int a, int b) throws ArithmeticException  {
		int d=0;
		if(!(b==0)) {
		 d = a / b;
		}else
			throw new ArithmeticException("Error b=0, I said dont use 0 ");
		return d;
	}

}
