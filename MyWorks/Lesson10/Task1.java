package Lesson10;

class JThread extends Thread {

	JThread(String name) {
		super(name);
	}

	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("I study Java");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread has been interrupted");
			}
		}

	}
}

public class Task1 {

	public static void main(String[] args) {
		new JThread("JThread").start();
	}
}


//Output text «I study Java» 10 times 
//with the intervals of one second (Thread.sleep(1000);)
