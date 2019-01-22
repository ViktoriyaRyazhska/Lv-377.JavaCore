package hw5.softserve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw5_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Making array and parse it from input		
				int nbz [] = new int [5];
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
				System.out.println("Input 5 numbers ");
				for (int i=0; i < nbz.length; i++ ){
				nbz[i] = Integer.parseInt(br.readLine());
				}
				System.out.println("Got it..");
				
		int min = nbz[0];
		int imin = 0;
		int ipos = 0;
		int i = 0;
		int n = 0;
			
			while (i < nbz.length  && n < 2){
				if (nbz[i] > 0){
					n++;
					ipos = i;
				}
				i++;
			}
		System.out.println("The place of second positive is: " + (ipos+1));
		
		i = 0;
		
		while (i < nbz.length){
			if (nbz[i] < min){
				min = nbz[i];
				imin = i;
			}
			i++;
		}
		System.out.println("The minimum is:" + min);
		System.out.println("its on position " + (imin+1));
	}

}
