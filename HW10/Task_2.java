package HW10;

public class Task_2 {
	public final static Object first = new Object();
	public final static Object second = new Object();

	public static void main(String[] args) {
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized (first) {
					Thread.yield();
					synchronized (second) {
						System.out.println("Success!");
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized (second) {
					Thread.yield();
					synchronized (first) {
						System.out.println("Success!");
					}
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}