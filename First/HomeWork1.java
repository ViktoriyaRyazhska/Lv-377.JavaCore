package SoftServe.First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.PI;

public class HomeWork1 {
    public static void main(String[] Args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the radius");
        int radius = Integer.parseInt(br.readLine());
        double perimeter = PI * radius * 2;
        double area = PI * Math.pow(radius, 2);
        System.out.println("Perimeter = "+perimeter+" Area = "+area);
    }
}
