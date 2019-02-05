import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HW888 h  = new HW888();
		System.out.println("Enter sentence with 5 word ");
		h.enter(in);
		h.split();
	}
}
