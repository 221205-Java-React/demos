package com.revature.controllers;

import com.google.gson.Gson;
import com.revature.daos.AuthDAO;
import com.revature.models.Employee;
import com.revature.models.LoginDTO;
import io.javalin.http.Handler;

public class AuthController {

    //AuthDAO so we can access its methods
    AuthDAO aDAO = new AuthDAO();

    //login will be a POST request, since the user is expected to send some data in the HTTP Request
    public Handler loginHandler = (ctx) -> {

        //ctx.body() to grab the HTTP Request data
        String body = ctx.body();

        //GSON for the JSON -> Java conversion
        Gson gson = new Gson();

        //take the incoming data, instantiate a LoginDTO class
        LoginDTO lDTO = gson.fromJson(body, LoginDTO.class); //.class means "turn this into a LoginDTO object"

        //if the login is successful, this Employee object will be populated. otherwise, null
        Employee loggedInEmployee = aDAO.login(lDTO.getFirst_name(), lDTO.getLast_name());

        if(loggedInEmployee != null){

            //turn the employee back into JSON, so we can send it in the HTTP Response
            String userJSON = gson.toJson(loggedInEmployee);

            ctx.result(userJSON);
            ctx.status(202); //202 "accepted"
        } else {
            ctx.status(401); //401 "unauthorized"
        }

    };

}
