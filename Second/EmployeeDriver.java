package SoftServe.Second;

public class EmployeeDriver {
    public static void main(String[] Args) {
        Employee Andy = new Employee("Енді", 10, 40);
        Employee Ivan = new Employee("Іван", 15, 40);
        Employee Roman = new Employee("Роман", 20, 30);

        System.out.println(Andy);
        System.out.println("bonuses "+Andy.bonuses());
        System.out.println(Ivan);
        System.out.println("bonuses "+Ivan.bonuses());
        System.out.println(Roman);
        System.out.println("bonuses "+Roman.bonuses());
        System.out.println("Total salary"+Employee.getTotalSum());
        Andy.changeRate(15);
        System.out.println(Andy);
        System.out.println("bonuses "+Andy.bonuses());
        System.out.println("Total salary"+Employee.getTotalSum());
    }
}
