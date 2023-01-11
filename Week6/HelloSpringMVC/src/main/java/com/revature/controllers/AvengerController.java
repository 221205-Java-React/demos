package com.revature.controllers;

import com.revature.daos.AvengerDAO;
import com.revature.models.Avenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller //Makes the Class a Bean, and lets us use all of the annotations below-
@RequestMapping(value="/avenger") //all requests ending in /mvc/avenger will go to this controller
@CrossOrigin //This lets us take in HTTP requests from anywhere (like your front end)
@ResponseBody //This makes it so that every method in the Class will convert responses to JSON for us
public class AvengerController {

    //we need to create and autowire an AvengerDAO so that we can use its methods
    public AvengerDAO aDAO;

    @Autowired
    public AvengerController(AvengerDAO aDAO) {
        this.aDAO = aDAO;
    }

    //Declaring some methods that can take in HTTP Requests (no more javalin - no more main method)

    //get all avengers (NOTE - @GetMapping is what lets GET requests access this method)
    @GetMapping
    public ResponseEntity<Avenger[]> getAllAvengers(){

        Avenger[] avengers = aDAO.getAll(); //get all avengers, nothing we haven't seen

        //we return a ResponseEntity, set the status code to 200 (OK) and set the response body data.
        return ResponseEntity.status(200).body(avengers);

        //no error handling in this - see the following methods

    }

    //get an avenger by ID
    @GetMapping("/{id}") //here, we add a PATH VARIABLE, which will let us get the user's requested ID
    public ResponseEntity<Avenger> getAvengerById(@PathVariable("id") int id){
        //@PathVariable will allow us to get the user-inputted path variable sent in the request

        //get an avenger from the DAO
        Avenger a = aDAO.getById(id);

        //if getById fails (the avenger is null)
        if(a == null) {
            //send back an empty response body, with a 400 level status code
            return ResponseEntity.status(404).build(); //.build is how we sent back NO response body
        }

        //if the avenger populates...
        return ResponseEntity.status(200).body(a);

    }

    //This method will take in an Avenger object, and update that avenger in the fake database
    @PutMapping //any HTTP PUT Request ending in /avenger will go here
    public ResponseEntity<Avenger> updateAvenger(@RequestBody Avenger avenger){

        //This Avenger will either be updated or null, depending on the validity of the incoming data
        Avenger updatedAvenger = aDAO.update(avenger);

        //if the update fails...
        if(updatedAvenger == null){
            return ResponseEntity.badRequest().build();
            //.badRequest() is a short way of applying a 400 status code
            //.build() is how we send no method body
        }

        //if update succeeded
        return ResponseEntity.accepted().body(updatedAvenger);
        //.accepted() is a short way of applying a 202 status code

    }


}