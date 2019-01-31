import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter sentenses");
		String sent=br.readLine();
		//if("\\  ".contains(sent)) {         //як позначити два пробіли?
		Del(sent);
		//}
		//else {
			//System.out.println(sent);
		//}
	
	}
	public static void Del(String sent) {
		String[] arrsent=sent.split(" ");
		for(int i=0;i<arrsent.length;i++) {
			if(!(arrsent[i].equals(""))) {
				System.out.print(arrsent[i] +" ");
			}
		}
		
	}
}