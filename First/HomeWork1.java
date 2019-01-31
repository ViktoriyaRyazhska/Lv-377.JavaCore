package SoftServe.First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.PI;

public class HomeWork1 {
    public static void main(String[] Args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the radius");
        int radius = 0;
        try {
            radius = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        double perimeter = PI * radius * 2;
        double area = PI * Math.pow(radius, 2);
        System.out.println("Perimeter = "+perimeter+" Area = "+area);
    }
}
