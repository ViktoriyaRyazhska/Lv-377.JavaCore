package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String s = "Ford car cost 20000.00 USD kjhkjhkh 30000,00";
        String pattern = "[0-9]+[.,][0-9]{2}+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);
        while (m.find()) {
            String temp = (s.substring(m.start(), m.end())).replace(",", ".");
            Float tempFloat = Float.valueOf(temp);
            System.out.println("$" + tempFloat + "0");
        }
    }
}

