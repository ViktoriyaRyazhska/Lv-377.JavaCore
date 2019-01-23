import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2 {
	

	public static void main(String[] args) throws Exception, IOException {
		
		int arr[] = new int[10];
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i< arr.length; i++) {
			System.out.println("Enter num");	
			arr[i]= Integer.parseInt( br.readLine());
		}
		
		int p=0;
		for(int i1=0; i1< arr.length; i1++) {
			if (arr[i1]<0) {
				p++;
			}
		}
		int sum=0;
		int prod=1;
		if (p==0) {
			for (int i2=0; i2<5; i2++) {
				sum += arr[i2];
			}
		System.out.println("sum= " + sum);
		}
		else {
			for(int i3=(arr.length-5); i3<arr.length; i3++) {
				prod =prod*arr[i3];
			}
			System.out.println("prod= " + prod);
		}
		
		int[] art = new int[100];
		int i4=0;
		int tmp = 0;
		 for ( i4=0; tmp>=0;art[i4]=tmp) {
			
			System.out.println("enter num");
			tmp=Integer.parseInt(br.readLine());	
			art[i4]=tmp;
			i4++;
		}
		//while ((tmp>=0) && (i4++>=0));
		for(int i5=0;art[i5]<=(i4);i5++) {
		System.out.print(art[i5] +" ");
		}
		
		
			
	}
}
		
		




