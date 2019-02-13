package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task09 {


    public int task09() {

        Random rand = new Random();
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer n");
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            int randomInt = rand.nextInt(2);
            if (randomInt == 1) {
                count++;
            }
        }
        return count;
    }
}