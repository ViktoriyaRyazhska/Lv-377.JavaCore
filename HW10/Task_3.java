package HW10;

public class Task_3 {
	public static void main(String[] args) {
		Thread tr1 = new MyTread("Thread number two", 3);
		tr1.start();
		try {
			tr1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread tr2 = new MyTread("Thread number three", 5);
		tr2.start();
		
//		Thread t1 = new One();
//		t1.start();
	}
}