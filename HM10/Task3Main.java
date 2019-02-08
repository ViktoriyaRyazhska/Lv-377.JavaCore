package hw10;

public class Task3Main extends Thread {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				Thread t2 = new Thread() {
					@Override
					public void run() {
						for (int i = 0; i < 3; i++) {
							System.out.println("Thread number 2");
						}
						Thread t3 = new Thread() {
							@Override
							public void run() {
								for (int i = 0; i < 5; i++) {
									System.out.println("Thread number 3");
								}
							}

						};
						t3.start();
					}

				};
				t2.start();
			}

		};
		t1.start();
	}
}
