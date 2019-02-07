package Lesson10;

class MyThread extends Thread {

	private int number, pause;
	private String msg;

	public MyThread(int number, int pause, String msg) {
		this.number = number;
		this.pause = pause;
		this.msg = msg;

	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(msg);
			try {
				sleep(pause);
			} catch (InterruptedException e) {
				System.out.println("Thread has been interrupted");
			}
		}
	}

}

public class HW1 {

	public static void main(String[] args) {

		Thread thr1 = new MyThread(1, 1000, "First thread");
		Thread thr2 = new MyThread(2, 1000, "Second thread");

		thr1.start();
		thr2.start();

		try {
			thr1.join();
			thr2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread main");

	}

}

// Run three threads and output there
// different messages for 5 times.
// The third thread supposed to start after
// finishing working of the two previous threads.
