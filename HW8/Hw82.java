package hw8.softserve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw82 {

	public static void main(String[] args) throws IOException {
		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Type txt with more than one space between words: ");
		String st = (br.readLine()).trim();
		
		st = st.replaceAll(" {2,}", " ");
		
System.out.println(st);
	}

}
