package com.lowes.bankingapp.service;

import com.lowes.bankingapp.exception.AccountException;
import com.lowes.bankingapp.model.Account;

import java.util.Collection;

public interface AccountService {
    // create
    int create(Account account) throws AccountException;
    // update
    boolean update(int id, Account account) throws AccountException;
    // view
    Account view(int id) throws AccountException;
    // delete
    boolean delete(int id) throws AccountException;
    // view all
    Collection<Account> viewAll();
}
