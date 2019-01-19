package SoftServe.Lesson5.HomeWork4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Third {
    public static void main(String[] Args) throws IOException {

        int[] Numbers = new int[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < Numbers.length; i++) {
            System.out.println("Enter "+i+" number of 5");
            Numbers[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0, j = 0; i < Numbers.length; i++) {
            if (Numbers[i] > 0) {
                j++;
            }
            if (Numbers[i] > 0 && j == 2) {
                System.out.println("Position of the second positive number is "+i);
                break;
            }
        }

        int min = Numbers[0];
        int minPosition = 0;
        for (int i = 0; i < Numbers.length; i++) {
            if (min > Numbers[i]) {
                min = Numbers[i];
                minPosition = i;
            }
        }
        System.out.println("Min number is "+min+" its position is "+minPosition);
    }
}
