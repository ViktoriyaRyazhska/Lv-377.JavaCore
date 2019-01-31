package SoftServe.Lesson5.HomeWork4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First {
    public static void main(String[] Args) {
        System.out.println("Enter the number of month");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int monthNumber = 0;
        try {
            monthNumber = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }catch (NumberFormatException e) {
            System.err.println("You have to enter a number ");
            e.printStackTrace();
        }
        int[] monthSize = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("The month "+monthNumber+" has "+monthSize[(monthNumber - 1)]);
    }
}
