package SoftServe.Lesson4.HomeWork3.FirstB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstB {
    public static void main(String[] Args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 int digit");
        int A = 0;
        try {
            A = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("Enter 2 int digit");
        int B = 0;
        try {
            B = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("Enter 3 int digit");
        int C = 0;
        try {
            C = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ThreeMinMax firstB = new ThreeMinMax(A, B, C);
        System.out.println("Max number "+firstB.getMax());
        System.out.println("Mix number "+firstB.getMin());
    }
}
