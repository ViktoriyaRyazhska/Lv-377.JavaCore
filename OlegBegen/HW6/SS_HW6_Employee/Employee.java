package com.company;

public abstract class Employee implements calculateSalary{

    private String name;
    private int EmpId;

    public Employee() {
    }

    public Employee(String name, int empId) {
        this.name = name;
        EmpId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }
    public void infoEmp(){
        System.out.print("Name: " + name + ", ID: " + getEmpId());
    }
}
