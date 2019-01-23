package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Car cars[] = new Car[4];
        cars[0] = new Car("Toyota", 2012, 1600);
        cars[1] = new Car("Audi", 2011, 2000);
        cars[2] = new Car("BMW", 2018, 1400);
        cars[3] = new Car("Ford", 2016, 2400);


        Car.getCarInfo(cars);
        Car.getYearCarInfo(br, cars);
        System.out.println("ordered by the field year");
        Car.getOrderOfYear(cars);
    }
}