package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter start renge:");
        int start = scan.nextInt();
        System.out.println("Enter end renge:");
        int end = scan.nextInt();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 5, 9, 10};

        try {
            readNumbe(start, end, arr);
        } catch (readNumberException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\n" + "try again :)");
    }

    static void readNumbe(int x, int y, int[] arr) throws readNumberException, NumberFormatException {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x || arr[i] > y)
                throw new readNumberException("The number " + arr[i] + " is not within the specified range");
        }
        System.out.print("these numbers are in range: " + x + " - " + y + " ----->>>> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}