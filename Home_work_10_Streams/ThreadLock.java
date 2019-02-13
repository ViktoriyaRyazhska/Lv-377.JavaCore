package Home_work_10_Streams;

public class ThreadLock implements Runnable {

	Thread lock = new Thread();

	@Override
	public void run() {

		synchronized (Deadlock.getA()) {
			Thread.yield();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			synchronized (Deadlock.getB()) {
				Thread.yield();
				System.out.println("Hello again");
			}
		}
	}
}
