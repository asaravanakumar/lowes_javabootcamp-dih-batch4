package com.lowes.bankingapp.service;

import com.lowes.bankingapp.exception.AccountValidationException;
import com.lowes.bankingapp.model.Account;
import com.lowes.bankingapp.model.AccountType;

public class AccountServiceArrImpl implements AccountService {

    private Account[] accounts = new Account[10];

    int counter;

    @Override
    public int create(Account account) throws AccountValidationException {

        if(account == null) {
            throw  new AccountValidationException();
        }
        // TODO: Logic to add account
        account.setId(++counter);
        accounts[counter-1] = account;
        return account.getId();
    }

//    private boolean validateAccount(Account account) {
//        AccountType.valueOf(account.getType())
//    }

    @Override
    public boolean update(int id, Account account) {
        // TODO: Logic to update account
        return false;
    }

    @Override
    public Account view(int id) {
        // TODO: Logic to view account
        return null;
    }

    @Override
    public boolean delete(int id) {
        // TODO: Logic to delete account
        return false;
    }

    @Override
    public Account[] viewAll() {
        return accounts;
    }
}
