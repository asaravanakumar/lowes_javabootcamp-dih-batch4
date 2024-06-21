package com.lowes.bankingapp;

import com.lowes.bankingapp.exception.AccountException;
import com.lowes.bankingapp.model.Account;
import com.lowes.bankingapp.model.AccountType;
import com.lowes.bankingapp.service.AccountService;
import com.lowes.bankingapp.service.AccountServiceArrImpl;

public class BankingAppMain {
    public static void main(String[] args) {

        AccountService accService = new AccountServiceArrImpl();

        // Welcome to BankingApp
//        1] Add Account
//        2] View All Accounts
//        3] View Account
//        4] Update Account
//        5] Delete Account
//        6] Exit

        // Enter the option

        // Capture the details

        Account account = new Account("Sanju", AccountType.SAVINGS, 50000.0);

        try {
            int id = accService.create(account);
            System.out.println("Account created successfully. Account ID - " + id);
        } catch (AccountException e) {
            throw new RuntimeException(e);
        }

        // View All Accounts
        Account[] accounts = accService.viewAll();

        for(Account acc: accounts) {
            System.out.println(acc);
        }
    }
}
