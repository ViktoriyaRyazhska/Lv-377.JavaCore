package maxmin;

public class Main {

	public static void main(String[] args) {
		int[] mas = {3, 5, 6, 9, 4};
		int count = 0;
		int indmin = 0;
		int min = mas[0];
		for(int i =0; i < mas.length; i++) {
			if(mas[i] > 0) {
			   count++;
			   if(count == 2) {
				   System.out.println("position of second positive number : " + i);
			   }
			}
			if(mas[i] < min) {
				min = mas[i];
				indmin = i;			
			}				
		}
		System.out.println("index minimum number : " + indmin);
		System.out.println("minimum number : " + min);
	}

}
