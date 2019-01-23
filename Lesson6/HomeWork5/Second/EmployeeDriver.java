package SoftServe.Lesson6.HomeWork5.Second;

public class EmployeeDriver {
    public static void main(String[] Args) {
        Employee[] employees = {new SalariedEmployee("Andrii", "01", "656561561551", 10, 160),
                new ContractEmployee("Ivan", "02", "462416323232", 1800),
                new SalariedEmployee("Roman", "03", "65565151661", 12, 150),
                new ContractEmployee("Vasya", "04", "65165444616", 2000)};

        for (Employee employee : employees) {
            employee.showInformation();
            System.out.println();
        }
    }
}
