package HW11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task_4 {
	public static void main(String[] args) {
		FileContent fc = new FileContent();
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("file1.txt"));
			String s = null;
			while ((s = br.readLine()) != null) {
				fc.add(s);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		System.out.println(fc);
		
		FileContent newFile = new FileContent();		
		newFile.add(Integer.toString(fc.getNumOfLines()));
		newFile.add(fc.getLongestLine());
		newFile.add("Volodymyr Romankiv, 1989-07-22");
		
		FileWrite saver = new FileWrite("file2.txt", newFile);
		saver.write();
	}
}