package MyPractices.Lesson10;

import java.io.*;

public class Third {
    public static void main(String[] args) {
        String fileName = "mytext.txt";
        String word = "мене";
        String[] fileLines = readFile(fileName, countLines(fileName));
        countSymbols(fileLines);
        System.out.println("The longest line is "+ findLongest(fileLines) + " the shortest line is " + findShortest(fileLines));
        findWord(fileLines, word);
    }

    static void findWord(String[] arr, String word) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().contains(word.toLowerCase())) {
                System.out.println(arr[i]);
            }
        }
    }

    static int findLongest(String[] arr) {
        int L = arr[0].length();
        int N = 0;
        for (int i = 0; i < arr.length; i++) {
            if (L < arr[i].length()) {
                L = arr[i].length();
                N = i + 1;
            }
        }
        return N;
    }

    static int findShortest(String[] arr) {
        int L = arr[0].length();
        int N = 0;
        for (int i = 0; i < arr.length; i++) {
            if (L > arr[i].length()) {
                L = arr[i].length();
                N = i + 1;
            }
        }
        return N;
    }

    static void countSymbols(String[] arr) {
        for (int i = 0, j =1; i < arr.length; i++, j++) {
            System.out.println("Line " + j + " has " + arr[i].length() + " symbols");
        }
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
}
