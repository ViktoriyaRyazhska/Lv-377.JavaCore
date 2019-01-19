package SoftServe.Lesson5.Second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeDriver {
    public static void main(String[] Args) throws IOException {
//        Employee andy = new Employee("Анді", 1, 400);
//        Employee roman = new Employee("Роман", 2, 500);
//        Employee ivan = new Employee("Іван", 1, 800);
//        Employee vlad = new Employee("Владислав", 2, 600);
//        Employee vasy = new Employee("Вася", 2, 300);

        System.out.println("Which department you want to see?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int departmentNumber = Integer.parseInt(br.readLine());
        br.close();
        Employee[] arr = {new Employee("Анді", 1, 400),
                new Employee("Роман", 2, 500), new Employee("Іван", 1, 800),
                new Employee("Владислав", 2, 600), new Employee("Вася", 2, 300)};
        Employee.showDepartment(departmentNumber, arr);
        System.out.println("---------------------------------------------------");
        Employee.sortBySalary(arr);
        Employee.showByOrder(arr);
    }
}
