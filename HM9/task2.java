import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {
	public static void main(String[] args) {
		int start=0;
		int end=0;
		int num=0;
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Input Start");
			start = Integer.parseInt(bf.readLine());
			System.out.println("Input End");
			end = Integer.parseInt(bf.readLine());
			System.out.println("Input Number");
			num = Integer.parseInt(bf.readLine());
		}catch(IOException e) {
			System.out.println("Wrong");
			e.getStackTrace();
		}catch (NumberFormatException e) {
			System.out.println("It's not a number");
			e.getStackTrace();
		}
		try {
		readNumber(start,end,num);
		} catch (OutOfRange e) {
			System.out.println(e.getMessage());
		}
System.out.println("Program Work");
	}
	
	public static void readNumber(int start , int end,int num) throws OutOfRange {
		if(num>=start && num<=end) {
			System.out.println("Number is in range ["+start+"..."+num+"..."+end+"]");
		}else {
		throw new OutOfRange("Out of the range");
		}
	}

}

class OutOfRange extends Exception{
	public OutOfRange(String mes) {
		super(mes);
	}
}
