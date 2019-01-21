package com.company;

public class Main {

    public static void main(String[] args) {
        int integer[] = {1, 2, -3, -4, -5, 6, -7, 8, 9, 10};
        int sum = 0;
        int count = 0;
        int i = 0;
        while (i < integer.length) {
            if (integer[i] >= 0) {
                sum = sum + integer[i];
                count++;
                if (count == 5) {
                    break;
                }
            }
            i++;
        }
        System.out.println(sum);

    }
}
