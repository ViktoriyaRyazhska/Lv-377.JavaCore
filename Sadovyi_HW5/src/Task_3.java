import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3 {
    int arn[] = new int[5];
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int arn[] = new int[5];
		for(int i=0; i< arn.length ; i++) {
		System.out.println("enter num");
		arn[i]=Integer.parseInt(br.readLine());
		}
		int k=0;
		for(int i1=0; i1<arn.length; i1++) {
			if (arn[i1]>0) {
				k++;				
			}
			if (k==2) {
				System.out.println("position of second positive number= " + (i1+1)); // Показує позицію рахуючи від 1 
				break;
			}			
		}
		int posmin=0;
		for(int i2=0; i2<arn.length; i2++) {
			if (arn[i2]<arn[posmin]) {
				posmin=i2;
			}
		}
		System.out.println("posmin= " + (posmin+1));  // Показує позицію рахуючи від 1 

	}

}
