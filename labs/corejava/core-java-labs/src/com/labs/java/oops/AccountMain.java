package com.labs.java.oops;

public class AccountMain {
    public static void main(String[] args) {
        // object instantiation with default constructor
        // Account account1 = new Account();

        // object instantiation with overloaded constructor
        // Account account1 = new Account(100, "Neha", "Deposit", 5000.0);

//        System.out.println(account1.getId());
//        System.out.println(account1.getName());
//        System.out.println(account1.getType());
//        System.out.println(account1.getBalance());

//        account1.deposit(10000.0);
//        account1.withdraw(2000.0);
//
//        System.out.println(account1.checkBalance());
//
//        account1 = null;

//        Account account2 = new Account(101, "Sanjay", "Loan", 500000.0);
//
//        System.out.println(account2.id);
//        System.out.println(account2.name);
//        System.out.println(account2.type);
//        System.out.println(account2.balance);


//        SavingsAccount savings = new SavingsAccount();
        Account savings = new SavingsAccount(100, "Neha", AccountType.SAVINGS, 5000.0);
        savings.openAccount();
//        savings.setId(100);
//        savings.setName("Ajay");
//        savings.setBalance(50000.0);
        printAccountDetails(savings);
        savings.closeAccount();


        DepositAccount deposit = new DepositAccount(101, "Amit", AccountType.DEPOSIT, 500000.0, 30, 7.0);
        deposit.openAccount();
        printAccountDetails(deposit);
        deposit.preClose();
        deposit.autoRenew();
        deposit.closeAccount();


        LoanAccount loan = new LoanAccount(102, "Alpha", AccountType.LOAN, 500000.0, 120, 9.5);
        loan.openAccount();
        printAccountDetails(loan);
        loan.preClose();
        loan.closeAccount();

        Account.AUTO_RENEW_IN_MONTHS = 40;

//        System.out.println(AutoRenewable.AUTO_RENEW_IN_MONTHS);
    }


    private static void printAccountDetails(Account account) {
        // Displaying AccountDetails based on Account Type
//        if(account instanceof SavingsAccount) {
//            com.labs.java.oops.SavingsAccount savings = (SavingsAccount) account;
//            System.out.println(savings.getId() + " " + savings.getName() + " " + savings.getBalance());
//        } else if(account instanceof DepositAccount) {
//            DepositAccount deposit = (DepositAccount) account;
//            System.out.println(deposit.getId() + " " + deposit.getName() + " " + deposit.getPrincipal() + " " + deposit.getTenure() + " " + deposit.getRoi());
//        } else if(account instanceof LoanAccount) {
//            LoanAccount loan = (LoanAccount) account;
//            System.out.println(loan.getId() + " " + loan.getName() + " " + loan.getLoanAmount() + " " + loan.getTenure() + " " + loan.getRoi());
//        }

        // Polymorphically calling the method
        account.printAccountDetails();
    }
}
