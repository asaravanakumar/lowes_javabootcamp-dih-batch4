package com.labs.java.oops;

public class SavingsAccount extends Account {

    protected double balance; // 8 bytes

    public SavingsAccount() {
        System.out.println("Default Savings Account constructor called..");
    }

    public SavingsAccount(int id, String name, String type, double balance) {
        super(id, name, type);
        this.balance = balance;
        System.out.println("Savings Account overloaded constructor called..");
    }

    // Annotation
    @Override
    public void openAccount() {
        System.out.println("Opening Savings Account");
    }

    @Override
    public void closeAccount() {
        System.out.println("Closing Savings Account");
    }

    // Overriding rules
    // 1. Method name should be same
    // 2. Parameters and type should be match
    // 3. Return type should be same type or sub-type
    @Override
    public void printAccountDetails() {
        System.out.println(this.getId() + " " + this.getName() + " " + this.getBalance());
    }

    public void printAccountDetails(boolean printAllDetails) {
        System.out.println(this.getId() + " " + this.getName() + " " + this.getBalance());

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance < 0) {
            System.out.println("Balance can't be negative");
        }
        this.balance = balance;
    }
}
