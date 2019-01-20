package dayArrayLoops;

public class ArrayLoopsMain {

	public static void main(String[] args) {
		
		int [] arr = {2, -1, 4, -3, 5};
/////////////task 1		
		int bigges = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (bigges < arr[i]) {
				bigges = arr[i];
			}
		}
		System.out.println("Biggest = "+bigges);
/////////////task 2
		int summ = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				summ = summ + arr[i];
			}
		}
		System.out.println("Summ = "+summ);
/////////////task 3
	int negative = 0;
	
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] < 0) {
			negative++;
		}
	}
	System.out.println("Quantity negative = "+negative);
/////////////task 3
	if (negative > (arr.length - negative)) {
		System.out.println("NEGATIVE");
	} else {
		System.out.println("POSITIVE");
	}
	}

}
