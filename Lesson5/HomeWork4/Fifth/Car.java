package SoftServe.Lesson5.HomeWork4.Fifth;

public class Car {
    private String type;
    private int year;
    private double engineCapacity;

    public Car(String type, int year, double engineCapacity) {
        this.type = type;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public static void showYear(int year, Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].year == year) {
                System.out.println(cars[i]);
            }
        }
    }

    public static void orderCarsByYear(Car[] cars) {
        Car tmp;
        for (int i = 0; i < (cars.length - 1); i++) {
            for (int j = (i + 1); j < cars.length; j++) {
                if (cars[i].year < cars[j].year) {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
    }

    public static void showCars(Car[] cars) {
        for (Car tmp : cars) {
            System.out.println(tmp);
        }
    }
}
