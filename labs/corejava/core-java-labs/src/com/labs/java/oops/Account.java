package com.labs.java.oops;

// Encapsulation

public abstract class Account {

    public static int AUTO_RENEW_IN_MONTHS = 30;

    // Access Modifiers - default, private, protected, public

    // properties
    protected int id; // 4 bytes
    protected String name; //
    protected AccountType type;

    // default
    public Account() {
        System.out.println("Default Account constructor called...");
//        id = 10;
//        name = "Anil";
//        type = "Savings";
//        balance = 50000.0;
    }

    // overloaded constructor
    public Account(int id, String name, AccountType type) {
        System.out.println("Account overloaded constructor called...");
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {

        this.type = type;
    }

    // methods / behaviours
    public void openAccount() {
        System.out.println("Default implementation for Open com.labs.java.oops.Account");
    }

    public abstract void closeAccount();

    public abstract void printAccountDetails();

//    public void deposit(double amount) {
//        balance += amount;
//    }
//
//    public void withdraw(double amount) {
//        balance -= amount;
//    }
//
//    public double checkBalance() {
//        double bal = balance;
//        return bal;
//    }
}
