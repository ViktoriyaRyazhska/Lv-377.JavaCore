package HW11;

import java.util.ArrayList;
import java.util.List;

public class FileContent {
	private List<String> str = new ArrayList<String>();

	public void add(String line) {
		this.str.add(line);
	}

	@Override
	public String toString() {
		String text = "";
		for (String string : str) {
			text += string + "\n";
		}
		return text;
	}

	public int getNumOfLines() {
		return str.size();
	}

	public String getLongestLine() {
		String line = "";
		for (String string : str) {
			line = string.length() > line.length() ? string : line;
		}
		return line;
	}

	public List<String> getStr() {
		return str;
	}

	public void setStr(List<String> str) {
		this.str = str;
	}
}
