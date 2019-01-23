package SoftServe.Lesson6.HomeWork5.Second;

public abstract class Employee implements Pay {

    private String name;
    private String employeeld;

    public Employee(String name, String employeeld) {
        this.name = name;
        this.employeeld = employeeld;
    }

    void showInformation() {
        System.out.println("Name "+name+" employeeld "+employeeld);
        calculatePay();
    }
}
