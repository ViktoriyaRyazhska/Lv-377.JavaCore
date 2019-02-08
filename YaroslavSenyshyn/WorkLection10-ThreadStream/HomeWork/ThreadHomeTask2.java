package ThreadHome;

public class ThreadHomeTask2 {
//	static Object A = new Object();
//	static Object B = new Object();
	static ThreadHomeTask2 A = new ThreadHomeTask2();
	static ThreadHomeTask2 B = new ThreadHomeTask2();

	public static void main(String[] args) {

		Thread thread1 = new Thread() {
			@Override
			public void run() {
				synchronized (B) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					Thread.yield();
					synchronized (A) {
						System.out.println("Success!");
					}}}};
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				synchronized (A) {
					Thread.yield();
					synchronized (B) {
						System.out.println("Success!");
					}}}};
		thread1.start();
		thread2.start();
		Thread.yield();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Hello");

	}
}
