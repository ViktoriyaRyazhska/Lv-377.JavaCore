package Lesson10;

class CThread extends Thread{
	
	private int number;
	private BThread bThread;

	public CThread(int number, Thread bThread) {
		this.number = number;
		this.bThread = (BThread) bThread;
	}

	public void run() {
	}

}

class BThread extends Thread{
	private int number;
	private String msg;
	
	public BThread(int number, String msg) {
	      this.number = number;
	      this.msg = msg;
	   }
	
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println("Thread number "+ msg);
			
		}
	}
}

public class HW3 {
	public static void main(String[] args) {
		
		Thread thr2 = new BThread(1, "two");
		Thread thr1 = new CThread(2, thr2);

		thr1.start();
		thr2.start();

		try {
			thr1.join();
			thr2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0; i<5; i++) {
			System.out.println("Thread number three");
		}
		
		
	}

}
