package SoftServe.Lesson4.HomeWork3.FirstB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstB {
    public static void main(String[] Args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 int digit");
        int A = Integer.parseInt(br.readLine());
        System.out.println("Enter 2 int digit");
        int B = Integer.parseInt(br.readLine());
        System.out.println("Enter 3 int digit");
        int C = Integer.parseInt(br.readLine());
        br.close();
        ThreeMinMax firstB = new ThreeMinMax(A, B, C);
        System.out.println("Max number "+firstB.getMax());
        System.out.println("Mix number "+firstB.getMin());
    }
}
