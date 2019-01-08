package homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the radius of your flower bed (shaped like a circle):");
		// r is for radius to read from buffer reader entered by user
		// p is for const 3.14159
		// l is for lenght of circle
		// d is for diametr of circle
		double r = Double.parseDouble(br.readLine());
		double p = 3.14159;
		double rr = r*r;
		double s = p * rr;
		double d = r + r;
		double l = p * d;
		
		
		System.out.println("The area is " + s);
		System.out.println("The perimetr is " + l);
		
		System.out.println(" Now next task.");
		//next one
		System.out.println("What is your name?");
		String name = br.readLine();
		
		System.out.println("Where do you live " + name + "?");
		String adress = br.readLine();
		System.out.println(name + " lives in " + adress);
		
		//third one
		//c1, t1 - Urugvai c2, t2 - China, c3, t3 - Japan
		// price per minute for each coutry
		System.out.println("Now about phonecalls to another coutries, let's imagine they are Urugvai, China and Japan.");
		System.out.println("Please enter price per minute for Urugvai.");
		double c1 = Double.parseDouble(br.readLine());
		
		System.out.println("Please enter price per minute for China.");
		double c2 = Double.parseDouble(br.readLine());
		
		System.out.println("Please enter price per minute for Japan.");
		double c3 = Double.parseDouble(br.readLine());
				
		// time for calling from each coutry
		System.out.println("How much you have speak with friend of yours from Urugvai?");
		double t1 = Double.parseDouble(br.readLine());
		
		System.out.println("How much you have speak with friend of yours from China?");
		double t2 = Double.parseDouble(br.readLine());

		System.out.println("How much you have speak with friend of yours from Japan?");
		double t3 = Double.parseDouble(br.readLine());
		
		// 
		double urugvai = c1 * t1;
		double china = c2 * t2;
		double japan = c3 * t3;
		double totaltime = t1 + t2 + t3;
		double totalmoney = urugvai + china + japan;
		
		System.out.println("Now you totlly spent for talk with Urugvai " + urugvai + "$.");
		System.out.println("Now you totlly spent for talk with China " + china + "$.");
		System.out.println("Now you totlly spent for talk with Japan " + japan + "$.");
		
		System.out.println("Totally you spent " + totalmoney +"$." );
		System.out.println("Totally you vaste your time for talks " + totaltime + " minutes.");
		
		System.out.println("Have a nice day!");
	}

}
