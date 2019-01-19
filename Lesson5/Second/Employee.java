package SoftServe.Lesson5.Second;

public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public static void showByOrder(Employee[] arr) {
        for (Employee tmp : arr) {
            System.out.println(tmp);
        }
    }

    public static void sortBySalary(Employee[] arr) {
        int L = arr.length;
        Employee tmp;
        for (int i = 0; i < (L - 1); i++) {
            for (int j = i + 1; j < L; j++) {
                if (arr[i].getSalary() < arr[j].getSalary()) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static void showDepartment(int departmentNumber, Employee[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartmentNumber() == departmentNumber) {
                System.out.println(arr[i]);
            }
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }
}
