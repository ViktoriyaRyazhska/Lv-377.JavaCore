package Lesson10;

class AThread extends Thread {
	
	   private int number;
	   private int pause;
	   private String message;

	   public AThread(int number, int pause, String message) {
		      this.number = number;
		      this.pause = pause;
		      this.message=message;
		   }


	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println(message);
			
			try {
				sleep(pause);
			} catch (InterruptedException e) {
				System.out.println("Thread has been interrupted");
			}
		}

	}
}



public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new AThread(1, 2000, "Hello world!");
		Thread thread1 = new AThread(2, 3000, "Peace in the peace");
		
		thread.start();
		thread1.start();

		thread.join();
		thread1.join();
		//Thread.sleep(16000);
		System.out.println("My name is Serhii");
		

	}

}

// Output two messages «Hello, world» and
// «Peace in the peace» 5 times each with the intervals
// of 2 seconds, and the second - 3 seconds.
// After printing messages, print the text «My name is …»
