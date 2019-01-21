package masInt;

public class Main {

	public static void main(String[] args) {
		int[] mas = {2, -4, 5, 3, -2, 9, 8, 4, -1, 3};
		int max = mas[0];
		int sum = 0;
		int countn = 0;
		int countp = 0;
		for(int i = 1; i<mas.length; i++) {
			if(max<mas[i]) {
				max = mas[i];
			}			
		}
		System.out.println("Max namber : " + max);
		int i =1;
		while (max < mas[i]) {
			max = mas[i];
			i++;
		}
		System.out.println("Max namber : " + max);
		

		for(i = 0; i<mas.length; i++ ) {
			if(mas[i] > 0) {
				sum += mas[i];
				countp++;
			}
			if(mas[i]<0) {
				countn++;
			}
		}
		System.out.println(sum);
		System.out.println("Amount of positive numbers in the array :  : " + countp);
		System.out.println("Amount of negative numbers in the array :  : " + countn);
		if(countp > countn) {
			System.out.println("Amount positive numbers > Amount of negative numbers");
		}else {
			System.out.println("Amount positive numbers < Amount of negative numbers");
		}

		
		
	}

}
