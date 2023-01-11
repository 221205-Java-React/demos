package com.revature.controllers;

import com.revature.daos.DigimonDAO;
import com.revature.models.Digimon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //This combines @Controller and @ResponseBody
@CrossOrigin //lets us take in HTTP requests (might have to specify ports in your P2)
@RequestMapping(value="/digimon")
public class DigimonController {

    //autowiring the DigimonDAO with constructor injection

    private final DigimonDAO dDAO;

    @Autowired
    public DigimonController(DigimonDAO dDAO) {
        super();
        this.dDAO = dDAO;
    }

    //HTTP Requests-------------------------------

    //insert digimon - every POST request to /digimon will go here
    @PostMapping
    public ResponseEntity addDigimon(@RequestBody Digimon d){

        //Thanks to @RequestBody, our Digimon d parameter is filled with the body of the HTTP Request
        //Automatic JSON conversion :)

        //the save() method from our DAO is how we can insert new data
        Digimon newDigimon = dDAO.save(d);

        //if insert failed...
        if(newDigimon == null){
            return ResponseEntity.badRequest().build(); //send a 400 status code, and no response body
        }

        //if insert succeeded...
        return ResponseEntity.accepted().body(newDigimon); //send a 202 status code and the new digimon

    }

}
