import java.util.Scanner;

public class HW888 {
	private String sentence;
	StringBuilder sb ;
	public String enter(Scanner in) {
		sentence = in.nextLine();
		return sentence;
	}

	public void split() {
		String max = "";
		String[] ar = sentence.split(" ");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i].length() > max.length()) {
				max = ar[i];
			}
			if(i==1) {
				sb= new StringBuilder(ar[i]);
				System.out.println(sb.reverse());
			}
		}
		System.out.println(max);
		System.out.println("This word has "+max.length()+" letters");
		
	}
	
	
}
