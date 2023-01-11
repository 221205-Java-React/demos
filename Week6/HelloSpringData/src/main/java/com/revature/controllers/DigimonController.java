package com.revature.controllers;

import com.revature.daos.DigimonDAO;
import com.revature.models.Digimon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    //GET all digimon - any GET requests to /digimon will go here
    @GetMapping
    public ResponseEntity<List<Digimon>> getAllDigimon(){

        return ResponseEntity.ok(dDAO.findAll()); //.ok() returns a 200 level status code

        //note that I'm nesting the DB call in the actual return
        //this is shorthand - I could have done .ok().body(dDAO.findAll());

    }

    @GetMapping(value="/id/{id}")
    public ResponseEntity<Digimon> findById(@PathVariable int id){

        /* findById from JpaRepository returns an Optional
          Optionals lend to code flexibility because it MAY OR MAY NOT have the request object.
          This helps us avoid NullPointerExceptions
         */
        Optional<Digimon> digimonOptional = dDAO.findById(id);

        //we can check if the optional has data with .isPresent(), or .isEmpty()
        if(digimonOptional.isPresent()){
            //we can extract the Optional's data with .get()
            Digimon extractedDigimon = digimonOptional.get();

            return ResponseEntity.ok(extractedDigimon);
        }
        //if get by ID failed...
        return ResponseEntity.badRequest().build(); //returning a 400 with no response body
    }

    @GetMapping(value="/name/{name}")
    public ResponseEntity<List<Digimon>> findByName(@PathVariable String name){

        Optional<List<Digimon>> digimonOptional = dDAO.findByDigimonName(name);

        //we can check if the optional has data with .isPresent(), or .isEmpty()
        if(digimonOptional.isPresent()){
            //we can extract the Optional's data with .get()
            List<Digimon> extractedDigimon = digimonOptional.get();

            return ResponseEntity.ok(extractedDigimon);
        }
        //if get by name failed...
        return ResponseEntity.badRequest().build(); //returning a 400 with no response body

    }

}
