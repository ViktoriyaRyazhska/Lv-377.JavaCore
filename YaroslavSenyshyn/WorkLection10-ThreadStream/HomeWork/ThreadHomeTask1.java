package ThreadHome;

public class ThreadHomeTask1 extends Thread {

	private String to;
	private int quantity;

	public ThreadHomeTask1(String to, int quantity) {
		this.to = to;
		this.quantity = quantity;
	}

	@Override
	public void run() {
		for (int i = 0; i < quantity; i++) {
			System.out.println(to);
		}
	}
}
