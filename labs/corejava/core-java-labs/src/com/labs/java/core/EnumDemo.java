package com.labs.java.core;

import com.labs.java.oops.AccountType;

public class EnumDemo {


    public static void main(String[] args) {
        for(WeekDays item: WeekDays.values()) {
            System.out.println(item);
        }

        for(AccountType type: AccountType.values()) {
            System.out.println(type);
        }

        AccountType savings = AccountType.valueOf("SAVINGS");
        System.out.println(savings);
    }
}
