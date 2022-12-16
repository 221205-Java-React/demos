package com.revature.controllers;

import com.google.gson.Gson;
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

        //PROBLEM: we can't send plain Java in an HTTP Response. We need JSON! This is where GSON comes in

        //instantiate a GSON object so that we can make Java <-> JSON conversions
        Gson gson = new Gson();

        //use the GSON .toJson() method to turn our Java into a JSON String (JSON is always in String format
        String JSONEmployees = gson.toJson(employees);

        //we use ctx.result() to send back an HTTP Response
        //in this case, the user requests all employee data, so that's what we're sending.
        ctx.result(JSONEmployees);

    };

}
