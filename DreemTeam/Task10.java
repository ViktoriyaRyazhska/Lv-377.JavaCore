package com.company;

import java.util.Scanner;

public class Task10 {

    public int task10() {
        System.out.println("Please write some number: ");
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int x = scanner.nextInt();

        for (; ; ) {
            if (x == 1) {
                break;
            }
            if ((x % 2) == 0) {
                x = x / 2;
            } else x = ((x * 3) + 1);
            count++;
        } return count;
    }
}
