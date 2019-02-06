package MyPractices.Lesson10.HomeWork9;

import java.io.*;

public class Fourth {
    public static void main(String[] args) {
        String fileName1 = "file1.txt";
        String fileName2 = "file2.txt";
        String nameBirthday = "Andriy";

        String[] words = readFile(fileName1, countLines(fileName1));
        writeFile(words, findLongest(words), nameBirthday, fileName2);


    }

    static int findLongest(String[] arr) {
        int L = arr[0].length();
        int N = 0;
        for (int i = 0; i < arr.length; i++) {
            if (L < arr[i].length()) {
                L = arr[i].length();
                N = i;
            }
        }
        return N;
    }

    static void writeFile(String[] words, int longestLine, String nameBirthday, String fileName) {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < words.length; i++) {
                bw.write(words[i].length() + ", ");
            }
            bw.newLine();
            bw.write(words[longestLine] + " ");
            bw.newLine();
            bw.write(nameBirthday);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int countLines(String fileName) {
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while (br.readLine() != null) {
                count++;
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    static String[] readFile(String fileName, int lines) {
        String s;
        String[] fileLines = new String[lines];
        int i = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((s = br.readLine()) != null) {
                fileLines[i] = s;
                i++;
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileLines;
    }
}
