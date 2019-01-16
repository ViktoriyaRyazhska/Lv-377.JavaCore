package SoftServe.Lesson4.HomeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstA {
    public static void main(String[] Args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 float digit");
        float A = Float.parseFloat(br.readLine());
        System.out.println("Enter 2 float digit");
        float B = Float.parseFloat(br.readLine());
        System.out.println("Enter 3 float digit");
        float C = Float.parseFloat(br.readLine());

        if (areInRange(A, B, C)) {
            System.out.println("They all belong to the range [-5, 5]");
        } else {
            System.out.println("They are out of range");
        }
    }

    static boolean areInRange(float A, float B, float C) {
        if ((((A >= -5) && (A <= 5)) && ((B >= -5) && (B <= 5))) && ((C >= -5) && (C <= 5))) {
            return true;
        } else {
            return false;
        }
    }
}
