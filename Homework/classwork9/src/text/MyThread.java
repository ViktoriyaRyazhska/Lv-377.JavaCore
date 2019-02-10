package text;

public class MyThread extends Thread{
	
	public void run() {
		String text = "I study Java";
		for(int i = 0; i < 10; i++) {
			System.out.println(text);
			try {
				MyThread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
						
		}
		
		
	}

}
