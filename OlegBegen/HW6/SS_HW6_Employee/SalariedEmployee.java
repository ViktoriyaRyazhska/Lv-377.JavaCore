package com.company;

public class SalariedEmployee extends Employee {
    private int hour;
    private double salaryHours;
    private String socialSecurityNumbe;

    public SalariedEmployee(int hour, double salaryHours, String socialSecurityNumbe) {
        this.hour = hour;
        this.salaryHours = salaryHours;
        this.socialSecurityNumbe = socialSecurityNumbe;
    }

    public SalariedEmployee(String name, int empId, int hour, double salaryHours, String socialSecurityNumbe) {
        super(name, empId);
        this.hour = hour;
        this.salaryHours = salaryHours;
        this.socialSecurityNumbe = socialSecurityNumbe;
    }

    @Override
    public void calculatePay() {
double averageSalary = getSalaryHours() * getHour();
        System.out.println(", the average monthly salary: " + averageSalary);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double getSalaryHours() {
        return salaryHours;
    }

    public void setSalaryHours(double salaryHours) {
        this.salaryHours = salaryHours;
    }

    public String getSocialSecurityNumbe() {
        return socialSecurityNumbe;
    }

    public void setSocialSecurityNumbe(String socialSecurityNumbe) {
        this.socialSecurityNumbe = socialSecurityNumbe;
    }
}
