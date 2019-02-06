package ThreadStreams;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class ThreadStreamsMain {

	public static void main(String[] args) throws InterruptedException, IOException {
///////Task1
//		Task1 t1 = new Task1();
//		t1.start();

///////Task2			
//		Task2 t2 = new Task2();
//		Task2 t3 = new Task2();
//		t2.start();
//		t3.start();
//		for (int i = 0; i < 5; i++) {
//			t2.print("Hello world!");
//			t2.sleep(2000);
//			t3.print("Peace in the peace");
//			t3.sleep(3000);
//		}
//
//		t2.join();
//		t3.join();
//
//		System.out.println("My name is Yaroslav");

////////Task3		
		File fileIn = new File("mytext.txt");
		Scanner sc = new Scanner(fileIn);

		ArrayList<String> array = Task3.saveLine(fileIn, sc);
		Task3.infoMinMaxLine(array);
		Task3.findAndPrintVar(array);
		sc.close();

	}

}
