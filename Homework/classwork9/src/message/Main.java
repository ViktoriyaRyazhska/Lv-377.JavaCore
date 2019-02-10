package message;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Message("Hello, world", 2000);
		Thread t2 = new Message("Peace in the peace", 3000);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("My name is Andriy");

}
}
