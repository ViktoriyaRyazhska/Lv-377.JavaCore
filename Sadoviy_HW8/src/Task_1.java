import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter sentenses");
		String sent=br.readLine();
		Longest(sent);
		SecondWord(sent);
	}
	
	
	
	
	public static void Longest (String sent ) {
		String[] arsent=sent.split(" ");
		
		int imax=0;
		
		for(int i=0;i<arsent.length;i++) {
			if(arsent[i].length()>arsent[imax].length()) {
				imax=i;
			}			
		}
		System.out.println("Longest word \""+ arsent[imax]+"\" has "+arsent[imax].length()+" letters");		
		
	}
	
	public static void SecondWord (String sent) {
		String[] arsent=sent.split(" ");
		System.out.print("The second word in reverse \"");
		for(int i=((arsent[1].length())-1);i>=0;i--) {
			System.out.print(arsent[1].charAt(i));
		}
		System.out.println("\"");
		
	}

}
