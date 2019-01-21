package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int integer[] = new int[5];
        System.out.println("Enter  5 integer:");
        for (int i = 0; i < integer.length; i++) {

            int x = scan.nextInt();
            if (x < 0) break;
            integer[i] = x;
        }

        System.out.println(" ");
        int i = 0;
        int count = 0;
        while (i < integer.length) {
            if (integer[i] > 0) count++;
            int position = i + 1;
            if (count == 2) System.out.println("Integer: " + integer[i] + ", position: " + position);
            i++;

        }
        int min = integer[0];
        int countMin = 0;
        while (i < integer.length){
            if (integer[i] < min) {
                min = integer[i];
                countMin = i;
            }
            i++;
        }
        System.out.print("Minimum: " + min);
        System.out.println(", is in " + (countMin+1) + " place");

        int product = 1;
        for (int j = 0; j < integer.length; j++){
            if (integer[j]%2 == 0)product = product * integer[j];
        }
        System.out.println("Sum even numbers: " + product);
    }

}
