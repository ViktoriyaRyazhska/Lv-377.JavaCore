package hw5.softserve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw5_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

//Making array and parse it from input		
		int nbz [] = new int [10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Input 10 numbers ");
		for (int i=0; i < nbz.length; i++ ){
		nbz[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Got it..");
		
//Summing or product..
		int sum = 0;
		int prod = 1;
		int n = 0;
		
		for (int i=0; i < nbz.length-5; i++){
			if (nbz[i] > 0){
				sum += nbz[i];
				n++;
			}else{
				break;
			}
					
		}
		if (n > 4){
					System.out.println("sum of first 5: " + sum);
		}else{
			for (int i=5; i < nbz.length; i++){
				prod = prod * nbz[i];
			}
					System.out.println("product of last 5: " + prod);
					System.out.println(n);
		}

	}

}
