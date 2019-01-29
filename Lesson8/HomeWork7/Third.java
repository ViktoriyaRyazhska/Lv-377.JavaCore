package SoftServe.Lesson8.HomeWork7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Third {
    public static void main(String[] Args) throws IOException {
        System.out.println("Enter the text from the console that contains several occurrences of US currency");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        showCurrency(findDigits(s));
    }

    static List<Float> findDigits(String text) {
        List<Float> list = new ArrayList<Float>();
        Pattern p = Pattern.compile("[0-9]+[.,][0-9]+");
        Matcher m = p.matcher(text);
        while (m.find()) {
            list.add(Float.valueOf((text.substring(m.start(), m.end())).replace(",",".")));
        }
        return list;
    }

    static void showCurrency(List<Float> list) {
        String format = "$%09.2f %n";
        for (int i = 0; i < list.size(); i++) {
            System.out.printf(format, list.get(i));
        }
    }
}
