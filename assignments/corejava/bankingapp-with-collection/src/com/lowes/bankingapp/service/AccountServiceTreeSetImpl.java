package com.lowes.bankingapp.service;

import com.lowes.bankingapp.exception.AccountException;
import com.lowes.bankingapp.model.Account;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class AccountServiceTreeSetImpl implements AccountService{
    private Set<Account> accounts = new TreeSet<>();
    @Override
    public int create(Account account) throws AccountException {
        return 0;
    }

    @Override
    public boolean update(int id, Account account) throws AccountException {
        return false;
    }

    @Override
    public Account view(int id) throws AccountException {
        return null;
    }

    @Override
    public boolean delete(int id) throws AccountException {
        return false;
    }

    @Override
    public Collection<Account> viewAll() {
        return accounts;
    }
}
