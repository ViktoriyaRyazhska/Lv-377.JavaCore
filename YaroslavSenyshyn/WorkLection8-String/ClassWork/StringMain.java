package String;

import java.util.Scanner;

public class StringMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//////Task1
		StringClassTask.contains(sc);
///////Task2				
		StringClassTask.output(sc);
//////Task3		
		StringClassTask.validation(sc);
		
		sc.close();
	}
}
