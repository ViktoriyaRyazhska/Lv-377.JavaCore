package com.company;

public class Main {

    public static void main(String[] args) {

        String soccer = "We play soccer on the field";
        String football[] = soccer.split(" ");

        int wordIndex = 0;
        int wordLenght = 0;
        for (int i = 0; i < football.length; i++) {
            if (wordLenght < football[i].length()) {
                wordLenght = football[i].length();
                wordIndex = i;
            }
        }
        System.out.println("the longest word is: " + football[wordIndex] + ", the number of its letters is: " + wordLenght);
        StringBuilder sb = new StringBuilder(football[1]);
        System.out.println(sb.reverse());
    }
}

