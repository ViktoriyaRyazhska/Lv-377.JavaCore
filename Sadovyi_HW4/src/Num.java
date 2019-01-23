import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter num");
		float a=Integer.parseInt(br.readLine());
		System.out.println("Enter num");
		float b=Integer.parseInt(br.readLine());
		System.out.println("Enter num");
		float c=Integer.parseInt(br.readLine());		
	
		if ((-5<=a)&&(a<=5)&&(-5<=b)&&(b<=5)&&(-5<=c)&&(c<=5))
			System.out.println("all belong to the range [-5,5]");		
		else System.out.println("not all belong to the range [-5,5]");
		
		System.out.println("Enter num");
		int a1=Integer.parseInt(br.readLine());
		System.out.println("Enter num");
		int b1=Integer.parseInt(br.readLine());
		System.out.println("Enter num");
		int c1=Integer.parseInt(br.readLine());
		
		System.out.println("Max is " + Math.max(a1, (Math.max(b1, c1))));
		System.out.println("Min is " + Math.min(a1, (Math.min(b1, c1))));
	}

	
}
