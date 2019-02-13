import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
	
	public static  void task3(BufferedReader br) {
		 float cost = 1;
		 float sum=0;
		System.out.println("Input cost of dollar");
		try {
			cost =Integer.parseInt( br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Input sum of money in gryvna ");
		try {
			sum=Integer.parseInt( br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    
		if(cost==0) {
			System.out.println("Cost can`t be zero");
		}
		System.out.println("User can buy " + (sum/cost) + " dollars ");

	}

}
