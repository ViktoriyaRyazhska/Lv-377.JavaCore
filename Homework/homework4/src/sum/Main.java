 package sum;

public class Main {

	public static void main(String[] args) {

		int[] mas = {2,4,-3,8,7,5,7,-4,5,-3};
		
		int sum = 0;
		int product = 1;
		int count = 0;
		for(int i = 0; i < mas.length; i++) {
			
			if(mas[i] > 0 && i < 5) {	
				count++;
				sum += mas[i];
				if(count == 5) {
					System.out.println(sum);
				}
				
			}else if(i > 4 && i <= 9){
				product = product * mas[i];	
				}
			
	}
		System.out.println(product);
	}
}
