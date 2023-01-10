package com.revature.models;

public class Account {

    private double accountBalance;
    private String accountType;

    //boilerplate code--------------------------------

    public Account() {
    }

    public Account(double accountBalance, String accountType) {
        this.accountBalance = accountBalance;
        this.accountType = accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountBalance=" + accountBalance +
                ", accountType='" + accountType + '\'' +
                '}';
    }
    
}
