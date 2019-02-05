import java.util.Scanner;



public class delite {
	private String sentence;
	public String enter(Scanner in) {
		sentence = in.nextLine();
		return sentence;
	}
	public String getEnter() {return sentence; }
	
	public String deliteSpace(String sentence) {
 String sen =null;
 sen= sentence.replaceAll("[ ]+"," ");
 return sen;
		
	}

	
}
