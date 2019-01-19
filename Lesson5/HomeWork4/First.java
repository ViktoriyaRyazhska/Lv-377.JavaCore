package SoftServe.Lesson5.HomeWork4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First {
    public static void main(String[] Args) throws IOException {
        System.out.println("Enter the number of month");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int monthNumber = Integer.parseInt(br.readLine());
        int[] monthSize = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("The month "+monthNumber+" has "+monthSize[(monthNumber - 1)]);
    }
}
