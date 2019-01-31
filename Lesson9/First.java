package SoftServe.Lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First {
    public static void main(String[] Args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        int b = 0;
        try {
            System.out.println("Enter a ");
            a = Integer.parseInt(br.readLine());
            System.out.println("Enter b ");
            b = Integer.parseInt(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            System.out.println(squareRectangle(a, b));
        } catch (ArithmeticException e){
            e.printStackTrace();
            System.err.println("Від'ємні значення");
        }
        System.out.println("Hello");
    }

    static int squareRectangle(int a, int b) throws ArithmeticException {
        if (a < 0 || b < 0) {
            throw new ArithmeticException();
        } else return a * b;
    }
}
