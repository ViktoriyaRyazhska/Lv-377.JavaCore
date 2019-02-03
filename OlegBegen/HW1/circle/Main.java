package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        double pi = 3.14159;
       // double perimeter, area;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double radius = Double.parseDouble(br.readLine());
        try {
            System.out.println("Perimeter =  " + (2 * (pi * getRadius(radius))));
            System.out.println("Area =  " + (pi * (getRadius(radius) * getRadius(radius))));
            //perimeter = 2 * (pi * getRadius(radius));
            //area = pi * (radius * radius);
        } catch (myException e) {
            System.out.println(e.getMessage());
        }
        //System.out.println("Perimeter =  " + perimeter);
        //System.out.println("Area =  " + area);
    }

    static double getRadius(double x) throws myException {
        if (x <= 0) throw new myException("number is neg");
        return x;
    }
}
