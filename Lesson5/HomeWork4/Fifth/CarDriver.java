package SoftServe.Lesson5.HomeWork4.Fifth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarDriver {
    public static void main(String[] Args) {

//        Car peugeot=new Car("308",2011,1.6);
//        Car kia=new Car("Rio",2008,2.0);
//        Car subaru=new Car("Outback",2009,3.0);
//        Car hyunadai=new Car("SantaFe",2012,2.7);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a year");
        int year = 0;
        try {
            year = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        Car[] cars = {new Car("308",2011,1.6),
                new Car("Rio",2008,2.0),
                new Car("Outback",2009,3.0),
                new Car("SantaFe",2012,2.7)};

        Car.showYear(year, cars);
        Car.orderCarsByYear(cars);
        Car.showCars(cars);
    }
}
