package SoftServe.Lesson8.HomeWork7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Second {
    public static void main(String[] Args) {

        System.out.println("Enter a sentence that contains the words between more than one space");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = null;
        try {
            sentence = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        String sentence = "Enter a sentence that      contains the   words between more than one space";
        System.out.println(getTrimedSentence2(sentence));
    }

    static String getTrimedSentence(String sentence) {
        String s = null;
        Pattern p = Pattern.compile("[A-Za-z]+[ ]");
        Matcher m = p.matcher(sentence);
        while (m.find()) {
            if (s == null) {
                s = (sentence.substring(m.start(), m.end()));
            } else {
                s += (sentence.substring(m.start(), m.end()));
            }
        }
        return s;
    }

    static String getTrimedSentence2(String sentence) {
        String s = null;
        s = sentence.replaceAll("[ ]+", " ");
        return s;
    }
}
