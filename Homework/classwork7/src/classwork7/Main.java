package classwork7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		
//		String st1 = "IT";
//		String st2 = "IT Academy";
//		System.out.println(st2.contains(st1));
//		System.out.println(st1.contains(st2));
//		
//		System.out.println("Input IOF");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String people = br.readLine();
//		String[] arr = people.split(" ");
//		System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
//		System.out.println(arr[1]);
//		System.out.println(arr[0] + " " +  arr[1].charAt(0) + " " + arr[2].charAt(0));
		
		String name = br.readLine();
//		Pattern p = Pattern.compile("[a-zA-Z_0-9]{3-15}");
		 Pattern p = Pattern.compile("[a-zA-Z_0-9]{3,15}");
		Matcher m = p.matcher(name);
		 if(m.find()) {
		        System.out.println(m.matches());
		        
		    }	
		 if(m.matches()) {
			 System.out.println(m.group());
		 }

	}

}
