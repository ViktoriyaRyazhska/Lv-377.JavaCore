package hw10;

public class task1Main {

	public static void main(String[] args) {
		thread1 t1 = new thread1();
		thread2 t2 = new thread2();
		thread3 t3 = new thread3();
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
