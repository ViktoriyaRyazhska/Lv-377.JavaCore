package First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Phone {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		//country tariff
		double c1,c2,c3;
		//quantity minutes for each country
		int t1,t2,t3;
		//calculate tariff for each country
		double s1,s2,s3;
		//generall summ
		double summ;
		
		System.out.println("Pleas input tariff for each country: c1, c2, c3");
		c1 = Double.parseDouble(br.readLine());
		c2 = Double.parseDouble(br.readLine());
		c3 = Double.parseDouble(br.readLine());
		System.out.println("Pleas input quantity minutes for each country: t1, t2, t3");
		t1 = Integer.parseInt(br.readLine());
		t2 = Integer.parseInt(br.readLine());
		t3 = Integer.parseInt(br.readLine());
		s1= c1*t1;
		s2= c2*t2;
		s3= c3*t3;
		summ= s1+s2+s3;
		System.out.println("Costs phone for c1: "+s1+"$; c2:"+s2+"$; c3:"+s3+"$");
		System.out.println("General cost: "+summ+"$");
	}	

}
