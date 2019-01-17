package Lesson1;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

public class HomeTask1 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the radius:");
		int r = Integer.parseInt(br.readLine());
		System.out.println("Area: " + (2*3.14*r));
		System.out.println("Perimetr: "+ (8*r));
		
	}

}





