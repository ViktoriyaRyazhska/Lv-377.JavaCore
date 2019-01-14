package phoneCalls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCalls {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input units per minute for 1-st countrie : ");
		int c1 = Integer.valueOf(bf.readLine());
		System.out.println("Input units per minute for 2-nd countrie : ");
		int c2 = Integer.valueOf(bf.readLine());
		System.out.println("Input units per minute for 3-d countrie : ");
		int c3 = Integer.valueOf(bf.readLine());
		System.out.println("Input continued for 1-st talk : ");
		int t1 = Integer.valueOf(bf.readLine());
		System.out.println("Input continued for 2-nd talk : ");
		int t2 = Integer.valueOf(bf.readLine());
		System.out.println("Input continued for 3-d talk : ");
		int t3 = Integer.valueOf(bf.readLine());
		int T1 = t1 * c1;
		int T2 = t2 * c2;
		int T3 = t3 * c3;
		System.out.println("1-st talk cost : " + T1);
		System.out.println("2-nd talk cost : " + T2);
		System.out.println("3-d talk cost : " + T3);
		System.out.println("Togethe all talks cost : " + (T1 + T2 + T3));
	}

}
