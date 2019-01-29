package SoftServe.Lesson8.HomeWork7;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Second {
    public static void main(String[] Args) throws IOException {

//        System.out.println("Enter a sentence that contains the words between more than one space");
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String sentence = br.readLine();
        String sentence = "Enter a sentence that      contains the   words between more than one space";
        System.out.println(getTrimedSentence(sentence));
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
}
