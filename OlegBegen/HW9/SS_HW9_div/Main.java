package com.company;

public class Main {

    public static void main(String[] args) {
        double a = 10;
        double b = 2;

        try {
            System.out.println(div(a, b));
        } catch (divException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hello!");
    }

    static double div(double x, double y) throws divException {

        if (y == 0) throw new divException("Unable to divide by 0");
        return x / y;
    }
}
