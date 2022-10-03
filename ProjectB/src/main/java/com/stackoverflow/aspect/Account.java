package com.stackoverflow.aspect;

public class Account implements AccountInterface {
    private int balance = 20;

    @Override
    public boolean withdraw(int amount) {
        if (balance < amount) {
            return false;
        }
        balance = balance - amount;
        return true;
    }
}
