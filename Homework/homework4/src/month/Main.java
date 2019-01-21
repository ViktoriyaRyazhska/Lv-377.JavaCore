package month;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input number month in year : ");
		int numberManth = Integer.valueOf(bf.readLine());
		int[] dayInManth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int i = 0; i < dayInManth.length; i++) {
			if(numberManth == (i+1)){
				System.out.println("Thith mounth have : " + dayInManth[i] + " days");
			}
		}
	}

}
