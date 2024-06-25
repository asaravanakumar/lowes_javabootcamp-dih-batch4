package com.lowes.bankingapp.service;

import com.lowes.bankingapp.exception.AccountException;
import com.lowes.bankingapp.model.Account;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class AccountServiceLnkListImpl implements AccountService {

    private List<Account> accounts = new LinkedList<>();

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
