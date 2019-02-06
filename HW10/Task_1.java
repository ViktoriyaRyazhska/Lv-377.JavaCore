package HW10;

public class Task_1 {
	public static void main(String[] args) {
		Thread t1 = new NewThread("first");
		Thread t2 = new NewThread("second");
		Thread t3 = new NewThread("last");
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
	}
}