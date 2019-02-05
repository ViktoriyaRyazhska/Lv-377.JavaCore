
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = null;
		try {
			s = in.nextLine();
		} catch (Exception e) {
			e.getStackTrace();
		}
		findAll(find(s));
		
	}
	
	public static List<Float> find( String s){
		List<Float> sent = new ArrayList<Float>();
		Pattern p = Pattern.compile("[0-9]+[.,][0-9]+");
		Matcher m = p.matcher(s);
		while(m.find()) {
			sent.add(Float.valueOf((s.substring(m.start(), m.end())).replace(",",".")));
		}
		return sent;
		
	}
	
	public static void findAll(List<Float> find) {	
		for(int i=0;i<find.size();i++) {
			System.out.printf("$%05.2f %n", find.get(i));
		}
	}

}
