package SoftServe.Second;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static int totalSum;

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += salary();
    }

    public static double getTotalSum() {
        return totalSum*1.1;
    }

    public int salary() {
        return rate * hours;
    }

    public void changeRate(int rate) {
        totalSum -= salary();
        this.rate = rate;
        totalSum += salary();
    }

    public double bonuses() {
        return salary() * 0.1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
