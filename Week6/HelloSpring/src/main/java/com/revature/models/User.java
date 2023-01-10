package com.revature.models;

public class User {

    private int userId;
    private String userName;
    private Account account;

    //boilerplate code-------------------------

    public User() {
    }

    public User(int userId, String userName, Account account) {
        this.userId = userId;
        this.userName = userName;
        this.account = account;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", account=" + account +
                '}';
    }
}
