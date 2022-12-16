package com.revature.controllers;

import com.revature.daos.EmployeeDAO;
import io.javalin.http.Handler;

/* The Controller layer is where HTTP Request get sent after Javalin directs them
 It's in this layer that JSON comes in and gets translated to Java and vice verse
 We'll either be getting data from the Service or DAO to get an HTTP Response to the front end (select)
 OR we'll be receiving data from the front end to send to the database (insert, update, delete)*/
public class EmployeeController {

    //We need an EmployeeDAO object to use its methods
    EmployeeDAO eDAO = new EmployeeDAO();

    //This Handler will get the HTTP GET Request for "get all employees"...
    //then send that Employee data back in an HTTP Response
    public Handler getEmployeesHandler = (ctx) -> {

    };

}
