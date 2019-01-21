package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        Car cars[] = new Car[4];
        cars [0] = new Car("Toyota",2012, 1600);
        cars [1] = new Car("Audi", 2011, 2000);
        cars [2] = new Car("BMW", 2018, 1400);
        cars [3] = new Car("Ford",2016, 2400);

//        Car car[] = new Car[4];
//        for (int i = 0; i < car.length; i++) {
//            System.out.println("Enter Year of production: ");
//            car[i].setYearOfproduction(scan.nextInt());
//            System.out.println("Enter Engine:");
//            car[i].setEngine(scan.nextInt());


//        Car cars[] = {new Car(2011, 1600),
//                new Car(2011, 2000),
//                new Car(2018, 1400),
//                new Car(2016, 2400)};

//        }
        //System.out.println("Enter year of production:  ");
//        int yearOfprod = Integer.parseInt(br.readLine());
//        System.out.println(yearOfprod);


        Car.getCarInfo(cars);
        Car.getYearCarInfo(cars);
        System.out.println("ordered by the field year");
        Car.getOrderOfYear(cars);
    }
}