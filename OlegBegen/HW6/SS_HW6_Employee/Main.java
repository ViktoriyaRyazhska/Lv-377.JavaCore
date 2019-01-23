package com.company;

public class Main {

    public static void main(String[] args) {

        Employee[] emp = new Employee[4];
        emp[0] = new ContractEmployee("Oleg", 01, 2000, "FT0001");
        emp[1] = new ContractEmployee("Igor", 02, 2400, "FT0002");
        emp[2] = new SalariedEmployee("Olga", 03, 40, 20, "SN0001");
        emp[3] = new SalariedEmployee("Ira", 04, 60, 25, "SN0002");

        for (int i = 0; i < emp.length; i++) {
            emp[i].infoEmp();
            emp[i].calculatePay();

        }
    }
}
