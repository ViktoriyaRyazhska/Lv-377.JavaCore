package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть країну №1.");
        String c1 = br.readLine();
        System.out.println("Введіть тривалість розмови в секундах №1.");
        double t1 = Double.parseDouble(br.readLine());
        System.out.println("Введіть країну №2.");
        String c2 = br.readLine();
        System.out.println("Введіть тривалість розмови в секундах №2.");
        double t2 = Double.parseDouble(br.readLine());
        System.out.println("Введіть країну №3.");
        String c3 = br.readLine();
        System.out.println("Введіть тривалість розмови в секундах №3.");
        double t3 = Double.parseDouble(br.readLine());
        System.out.println(c1 + ": " +t1);
        System.out.println(c2 + ": " +t2);
        System.out.println(c3 + ": " +t3);
        System.out.println("тривалість всіх розмов: " + (t1 + t2 + t3) + " секунд");

    }

}
