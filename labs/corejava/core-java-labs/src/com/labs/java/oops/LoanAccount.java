package com.labs.java.oops;

public class LoanAccount extends Account implements PreClosable {

    private double loanAmount;
    private int tenure;
    private double roi;

    public LoanAccount() {
    }

    public LoanAccount(int id, String name, AccountType type, double principal, int tenure, double roi) {
        super(id, name, type);
        this.loanAmount = principal;
        this.tenure = tenure;
        this.roi = roi;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    @Override
    public void openAccount() {
        System.out.println("Opening Account");
    }

    @Override
    public void closeAccount() {
        System.out.println("Closing Account");
    }

    @Override
    public void printAccountDetails() {
        System.out.println(this.getId() + " " + this.getName() + " " + this.getLoanAmount() + " " + this.getTenure() + " " + this.getRoi());

    }

    @Override
    public void preClose() {
        System.out.println("Pre-closing Loan Account");
    }
}
