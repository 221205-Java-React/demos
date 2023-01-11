package com.revature.controllers;

import com.revature.daos.DigimonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //This combines @Controller and @ResponseBody
@CrossOrigin //lets us take in HTTP requests (might have to specify ports in your P2)
@RequestMapping(value="/digimon")
public class DigimonController {

    //autowiring the DigimonDAO with constructor injection
    private DigimonDAO dDAO;

    @Autowired
    public DigimonController(DigimonDAO dDAO) {
        this.dDAO = dDAO;
    }



}
