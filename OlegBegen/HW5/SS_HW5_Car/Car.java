package com.company;

import java.io.BufferedReader;
import java.io.IOException;

public class Car {
    public String type;
    public int yearOfproduction;
    public int engine;

    public Car() {
    }

    public Car(String type, int yearOfproduction, int engine) {
        this.type = type;
        this.yearOfproduction = yearOfproduction;
        this.engine = engine;
    }


    public static void getCarInfo(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Type: " + cars[i].getType() + ", Year of production : " + cars[i].getYearOfproduction() + ", engine capacity : " + cars[i].getEngine());
        }
    }

    public static void getYearCarInfo(BufferedReader br, Car[] cars) throws IOException {
        System.out.println("Enter year of production:  ");
        int yearOfprod = Integer.parseInt(br.readLine());
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYearOfproduction() == yearOfprod)
                System.out.println("Type: " + cars[i].getType() + ", Year of production : " + cars[i].getYearOfproduction() + ", engine capacity : " + cars[i].getEngine());
        }

    }

    public static void getOrderOfYear(Car[] cars) {
        Car tmp;
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars.length; j++) {
                if (cars[i].getYearOfproduction() < cars[j].getYearOfproduction()) {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Type: " + cars[i].getType() + ", Year of production : " + cars[i].getYearOfproduction() + ", engine capacity : " + cars[i].getEngine());
        }

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfproduction() {
        return yearOfproduction;
    }

    public void setYearOfproduction(int yearOfproduction) {
        this.yearOfproduction = yearOfproduction;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfproduction=" + yearOfproduction +
                ", engine=" + engine +
                '}';
    }
}
