package hw10;

public class Task2Main {
	public static final Object A = new Object();
	public static final Object B = new Object();

	public static void main(String[] args) {
		Thread one = new Thread() {
			@Override
			public void run() {
				synchronized (A) {
					Thread.yield();
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {

					}

					synchronized (B) {
						System.out.println("Deadlock");
					}
				}
			}
		};
		Thread two = new Thread() {
			@Override
			public void run() {
				synchronized (B) {
					Thread.yield();

					synchronized (A) {
						System.out.println("Deadlock");
					}
				}
			}
		};

		one.start();
		two.start();
		Thread.yield();
		try {
			one.join();
			two.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Program Work");
	}
}
