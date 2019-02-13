package HW11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	private String name;
	private FileContent file;
	
	public FileWrite(String name, FileContent file) {
		this.name = name;
		this.file = file;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FileContent getFile() {
		return file;
	}

	public void setFile(FileContent file) {
		this.file = file;
	}
	
	public void write() {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(name));
			for (String string : file.getStr()) {
				bw.write(string + "\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}