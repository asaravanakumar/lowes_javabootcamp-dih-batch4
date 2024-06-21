package com.labs.java.oops;

public enum AccountType {
    SAVINGS(1, "Savings"), DEPOSIT(2, "Deposit"), LOAN(3, "Loan"), CURRENT(4, "Current");

    private int id;
    private String displayType;
    AccountType(int id, String displayType) {
        this.id = id;
        this.displayType = displayType;
    }

    public String getDisplayType() {
        return this.displayType;
    }

    public int getId() {
        return this.id;
    }
}
