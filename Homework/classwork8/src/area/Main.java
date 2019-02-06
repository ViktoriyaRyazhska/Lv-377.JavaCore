package area;

import java.io.IOException;
public class Main {

	public static void main(String[] args){
		int a = 0;
		int b = 0;					
			Square square = new Square();
			try {
				System.out.println(square.squareRectangle(a, b));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (ArithmeticException e) {
				System.out.println("error");
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	
	}
}
