package message;

public class Message extends Thread{

	private String text;
	private int pauze;
	
	
	public Message(String text, int pauze) {
		this.text = text;
		this.pauze = pauze;
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
	         try {
				sleep(pauze);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	         System.out.println("Thread " + text);
	      }
	}
	
}
