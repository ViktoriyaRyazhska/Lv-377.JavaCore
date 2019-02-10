package potik;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Main {

	public static void main(String[] args) {
		Thread p1 = new MyThread("I am Andriy");
		Thread p2 = new MyThread("I have a bool");
		Thread p3 = new MyThread("I play foolball");
		
		p1.start();
		try {
			p1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		p2.start();
		try {
			p2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		p3.start();

		
		
	}

}
