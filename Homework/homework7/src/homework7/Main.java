package homework7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter sentence with five words");
//		
//		String sentence1 = br.readLine();
//		 int imax = 0;
//		String[] arr = sentence1.split(" ");
//		int max = arr[0].length();
//		for(int i = 0; i<arr.length; i++) {
//			if(max < arr[i].length()) {
//				max = arr[i].length();
//				 imax = i;				
//			}
//			
//		}
//		String x = new StringBuffer(arr[1]).reverse().toString();
//         System.out.println("Max word : " + arr[imax] + " " + max + "letters");
//         System.out.println(x);
         
         /////////////////////////////////////////////////////////////////
		
//         System.out.println("Enter a sentence that contains the words between more than one space");
//         String centence2 = br.readLine();
//         System.out.println(centence2.replace("   ", " "));
         
         ///////////////////////////////////////////////////////////////////
         System.out.println("Enter text that contains several occurrences of US currency");
         String dollar = br.readLine();
         Pattern d = Pattern.compile("[$0-9.]+[1-9]{2}");
         Matcher m = d.matcher(dollar);
         if(m.find()) {
        	 System.out.println(m.matches());
         }
         if(m.matches()) {
        	 System.out.println(m.group());
         }
         
         
	}

}
