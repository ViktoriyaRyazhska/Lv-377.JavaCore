package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String soccer = "We     play soccer    on the   field.";
        formatText(soccer);
    }
    static void formatText(String text) {
        String pattern = "[a-zA-Z-.]+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.print(text.substring(m.start(), m.end()) + " ");
        }
    }
}
