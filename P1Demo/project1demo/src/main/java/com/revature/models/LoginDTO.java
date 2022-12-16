package com.revature.models;

/*WHAT is a DTO?? Data Transfer Object. It's meant to model some data that doesn't match a DB table
 In this case, we need a Class that can hold the user-inputted username/password when they login
 The username/password that the user enters will get stored in a LoginDTO object.
 You NEVER store a DTO in the database. It's strictly for data transfer from frontend/backend

 Two main DTO use cases:
 1) When you don't want to send or use an entire object (you just need username/password to login)
 2) When you don't intend to store incoming data in the DB (meant just for the Java logic)
 */
public class LoginDTO {

    //variables that will hold the first name and last name. again, this should be username/password in your P1
    private String first_name;
    private String last_name;

    //realistically, we only need an all-args constructor
    public LoginDTO(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
