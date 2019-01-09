package Sadovyi_HW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sadovyi_HW1_1 {
public static void main(String[] args) throws Exception, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the radius");
	int R = Integer.parseInt(br.readLine());
	System.out.println("Perimeter " + (6.28*R));
	System.out.println("Area " + (3.14*R*R));}
	
}
