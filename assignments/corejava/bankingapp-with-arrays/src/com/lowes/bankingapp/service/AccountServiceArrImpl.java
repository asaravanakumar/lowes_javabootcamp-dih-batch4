package com.lowes.bankingapp.service;

import com.lowes.bankingapp.model.Account;

public class AccountServiceArrImpl implements AccountService {

    private Account[] accounts = new Account[10];

    @Override
    public int create(Account account) {
        // TODO: Logic to add account
        return 0;
    }

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
