package Home_work_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Perimeter {

	//Flower bed is shaped like a circle. 
	//Calculate the perimeter and area by entering the radius. Output obtained results.

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		double radius = sc.nextDouble();
		
		double perimeter = 2 * radius * Math.PI;
		double area = Math.PI * Math.pow(radius, 2);
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		
		System.out.println("Your circle perimeter is " + Math.round(perimeter));
		System.out.println("Your circle area is " + df.format(area));
		sc.close();

	}

}
