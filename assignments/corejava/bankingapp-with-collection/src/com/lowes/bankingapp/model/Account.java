package com.lowes.bankingapp.model;

public class Account {
    private int id;
    private String name;
    private AccountType type;
    private double balance;
    private boolean active;


    public Account( String name, AccountType type, double balance) {
        this.name = name;
        this.type = type;
        this.balance = balance;
        this.active = true;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", balance=" + balance +
                ", active=" + active +
                '}';
    }
}
