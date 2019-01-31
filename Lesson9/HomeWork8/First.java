package SoftServe.Lesson9.HomeWork8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First {
    public static void main(String[] Args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = 0;
        double b = 0;

        try {
            System.out.println("Enter a ");
            a = Double.parseDouble(br.readLine());
            System.out.println("Enter b ");
            b = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.err.println("Console has been disappeared ");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("You didn't enter a number ");
            e.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            System.out.println(div(a, b));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("Normal exit from program ");
    }

    static double div(double a, double b) throws ArithmeticException {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("b = 0, so it's bad ");
        }
    }
}
