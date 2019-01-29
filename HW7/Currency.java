import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Currency {

	public static void main(String[] args) {
		String sentence = "$2.56 mabc $12,76-f 12,85 $5,26 $2.56$2.06 $5.15";
		String pattern = "\\$[0-9]+\\.[0-9]{2}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(sentence);
		
		while (m.find()) {
			System.out.println(sentence.substring(m.start(), m.end()) +  "*");
		}
		

	}

}
