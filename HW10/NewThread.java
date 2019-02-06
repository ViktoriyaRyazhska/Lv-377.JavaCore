package HW10;

public class NewThread extends Thread {
	private String mess;

	public NewThread(String mess) {
		this.mess = mess;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(mess);
		}
	}
}