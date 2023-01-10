package com.revature.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //we want to make this a bean, and @Component (as well as the other 3 stereotypes) can do that
public class User {

    private int userId;
    private String userName;
    //@Autowired - BAD PRACTICE (breaks encapsulation)
    private Account account;

    //boilerplate code-------------------------

    public User() {
    }

    public User(int userId, String userName, Account account) {
        this.userId = userId;
        this.userName = userName;
        this.account = account;
    }

    //we created this constructor to accomplish CONSTRUCTOR INJECTION to wire our beans with Autoeiring
    @Autowired
    //what this accomplishes is the automatic instantiation of Accounts for each of our Users
    public User(Account account) {
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

    //@Autowired - setter injection, fine practice (I prefer constructor)
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
