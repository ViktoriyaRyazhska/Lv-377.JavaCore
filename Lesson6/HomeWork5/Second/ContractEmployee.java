package SoftServe.Lesson6.HomeWork5.Second;

public class ContractEmployee extends Employee {

    private String federalTaxIdmember;
    private int fixedMonthlyPayment;

    public ContractEmployee(String name, String employeeld, String federalTaxIdmember, int fixedMonthlyPayment) {
        super(name, employeeld);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public void calculatePay() {
        System.out.print(" The average monthly salary "+fixedMonthlyPayment);
    }
}
