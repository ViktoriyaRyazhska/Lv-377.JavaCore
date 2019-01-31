package SoftServe.Lesson5.HomeWork4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Second {
    public static void main(String[] Args) {
        int[] Numbers = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < Numbers.length; i++) {
            System.out.println("Enter "+i+" number");
            try {
                Numbers[i] = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }catch (NumberFormatException e) {
                System.err.println("You have to enter a number");
                e.printStackTrace();
            }

        }

        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int sum = 0;
        boolean isNegativ = false;
        for (int i = 0; i < 5; i++) {
            if (Numbers[i] < 0) {
                isNegativ = true;
            }
        }

        if (isNegativ) {
            for (int i = 5; i < Numbers.length; i++) {
                sum += Numbers[i];
            }
        } else {
            for (int i = 0; i < 5; i++) {
                sum += Numbers[i];
            }
        }
        System.out.println("Sum of elements "+sum);
    }
}
