package com.company;

public class ContractEmployee extends Employee {

    private double salaruContract;
    private String federalTaxIdmember;

    public ContractEmployee(double salaruContract, String federalTaxIdmember) {
        this.salaruContract = salaruContract;
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public ContractEmployee(String name, int empId, double salaruContract, String federalTaxIdmember) {
        super(name, empId);
        this.salaruContract = salaruContract;
        this.federalTaxIdmember = federalTaxIdmember;
    }

    @Override
    public void calculatePay() {
        System.out.println(", the average monthly salary: " + getSalaruContract());
    }

    public double getSalaruContract() {
        return salaruContract;
    }

    public void setSalaruContract(double salaruContract) {
        this.salaruContract = salaruContract;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }
}
