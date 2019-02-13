package tasks;

public class Task01 {
	public static long fibonacci(int n) {
		if (n <= 1) { return n;	} 
		else { return fibonacci(n - 1) + fibonacci(n - 2); }
	}
}