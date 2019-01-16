package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int min = 0;
        int max = 0;
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();


        if (a > b && a > c) max = a;
        if (b > a && b > c) max = b;
        if (c > a && c > b) max = c;

        if (a < b && a < c) min = a;
        if (b < a && b < c) min = b;
        if (c < b && c < a) min = c;

        System.out.println("max - " + max);
        System.out.println("min - " + min);

    }
}
