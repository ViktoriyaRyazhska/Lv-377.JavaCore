package SoftServe.Lesson6.HomeWork5.Second;

public class SalariedEmployee extends Employee {

    private String socialSecurityNumber;
    private int hourlyRate;
    private int workHours;

    public SalariedEmployee(String name, String employeeld, String socialSecurityNumber, int hourlyRate, int workHours) {
        super(name, employeeld);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
    }

    @Override
    public void calculatePay() {
        System.out.print(" The average monthly salary "+hourlyRate * workHours);
    }
}
