package potik;

public class MyThread extends Thread{
	public String text;

	public MyThread(String text) {
		this.text = text;
	}
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(text);
		}
	}
	
	

}
