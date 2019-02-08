package ThreadHome;

public class ThreadHomeTask3 extends Thread {

	int quantity = 3;

	@Override
	public void run() {
		for (int i = 0; i < quantity; i++) {
			System.out.println(getName());
		}
	}

	public static void main(String[] args) {

		ThreadHomeTask3 t1 = new ThreadHomeTask3() {
			@Override
			public void run() {
				super.run();
				ThreadHomeTask3 t2 = new ThreadHomeTask3() {
					@Override
					public void run() {
						quantity += 2;
						super.run();
					}};
				t2.start();
			}};

		t1.start();
	}
}
