package task3;

public class Main {

	public static void main(String[] args) {
		Thread o = new Thread() {
			public void run() {				
					Thread t = new Thread() {
						public void run() {
							for(int i = 0; i < 3; i++) {
							System.out.println("Thread number 2");
						}
						}
					};
					t.start();
				Thread tr = new Thread() {
			public void run() {
				for(int j = 0; j < 5; j++) {
				System.out.println("Thread number 3");
				}
			}
		};
		tr.start();	
		
			}
		};
		o.start();
		
		

	}

}
