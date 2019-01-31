package SoftServe.Lesson8.HomeWork7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First {
    public static void main(String[] Args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter sentence ");
        String sentence = null;
        try {
            sentence = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        String sentence = "Enter in the console sentence of five words";
        String[] words = sentence.split("[ ,:]");
        showLongestWord(words);
        StringBuilder sb;
        if (words.length > 1) {
            sb = new StringBuilder(words[1]);
        } else {
            sb = new StringBuilder(words[0]);
        }
        System.out.println(sb.reverse());
    }

    static void showLongestWord(String[] words) {
        int wordLength = 0;
        int wordNumber = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > wordLength) {
                wordLength = words[i].length();
                wordNumber = i;
            }
        }
        System.out.println("The longest word is \""+words[wordNumber]+"\" which contain "+wordLength+" symbols");
    }
}
