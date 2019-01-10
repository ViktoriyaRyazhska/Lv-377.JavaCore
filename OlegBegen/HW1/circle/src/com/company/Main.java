package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        double pi = 3.14159;
        double perimeter, area;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double radius = Double.parseDouble(br.readLine());
        perimeter = 2 * (pi * radius);
        area = pi * (radius * radius);
        System.out.println("Perimeter =  " + perimeter);
        System.out.println("Area =  " + area);
    }
}
