package com.revature.controllers;

import com.revature.daos.EmployeeDAO;
import com.revature.models.Employee;
import io.javalin.http.Handler;

import java.util.ArrayList;

/* The Controller layer is where HTTP Request get sent after Javalin directs them
 It's in this layer that JSON comes in and gets translated to Java and vice verse
 We'll either be getting data from the Service or DAO to get an HTTP Response to the front end (select)
 OR we'll be receiving data from the front end to send to the database (insert, update, delete)*/
public class EmployeeController {

    //We need an EmployeeDAO object to use its methods
    EmployeeDAO eDAO = new EmployeeDAO();

    //This Handler will get the HTTP GET Request for "get all employees"...
    //then sends that Employee data back in an HTTP Response
    public Handler getEmployeesHandler = (ctx) -> {

        /*What's ctx?? The context object! This object contains methods that we can use to
         process HTTP Requests and send HTTP Responses*/

        //We need an ArrayList of Employees, courtesy of our EmployeeDAO
        ArrayList<Employee> employees = eDAO.getEmployees();

        //temporary, just to make sure postman works. ctx.result() sends a Reponse back
        ctx.result("Handler Works!");

    };

}
