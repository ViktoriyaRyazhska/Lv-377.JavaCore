package HW10;

public class One extends Thread {
	Thread t2 = new Two();
	
	@Override
	public void run() {
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}