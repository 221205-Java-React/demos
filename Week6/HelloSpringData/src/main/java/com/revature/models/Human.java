package com.revature.models;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity //makes the class a DB table
@Table(name = "humans")
@Component
public class Human {

    @Id //makes the field the PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //this makes the PK serial
    private int humanId;

    //remember, we don't NEED @Column unless we're adding constraints

    private String username;

    private String password;

    //boilerplate code-----------------------------
    public Human() {
    }

    public Human(int humanId, String username, String password) {
        this.humanId = humanId;
        this.username = username;
        this.password = password;
    }

    public Human(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getHumanId() {
        return humanId;
    }

    public void setHumanId(int humanId) {
        this.humanId = humanId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Human{" +
                "humanId=" + humanId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
