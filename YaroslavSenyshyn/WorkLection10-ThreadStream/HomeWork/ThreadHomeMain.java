package ThreadHome;


public class ThreadHomeMain {

	public static void main(String[] args) throws InterruptedException {
/////////task1
		ThreadHomeTask1 t1 = new ThreadHomeTask1("I am thread 1", 5);
		ThreadHomeTask1 t2 = new ThreadHomeTask1("I am thread 2", 5);
		ThreadHomeTask1 t3 = 
				new ThreadHomeTask1("I am thread 3", 5) {
					@Override
					public void run() {
						try {
							t1.join();
							t2.join();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						super.run();
					}
				};
		t1.start();
		t2.start();
		t3.start();			
	}
}
