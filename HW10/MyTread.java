package HW10;

public class MyTread extends Thread {
	private String str;
	private int num;
	
	public MyTread(String str, int num) {
		this.str = str;
		this.num = num;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < num; i++) {
			System.out.println(str);
		}
	}
}