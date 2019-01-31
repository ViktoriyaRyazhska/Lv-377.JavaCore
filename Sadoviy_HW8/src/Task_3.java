import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter text");
		String cur=br.readLine();
		Search(cur);

	}
	public static void Search(String cur) {
		Pattern p = Pattern.compile("(\\$\\d+\\.\\d{2})");  //Якщо після крапки біше 2 символів то виводить
		Matcher m = p.matcher(cur);  
		if(m.find()){  
			System.out.println(m.group());     				//Виводить тільки перше знайдене значення
		}  
		
	}

}
