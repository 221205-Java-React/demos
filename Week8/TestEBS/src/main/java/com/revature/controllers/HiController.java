package com.revature.controllers;


import com.revature.daos.HiDAO;
import com.revature.models.Digimon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/yeah")
public class HiController {

    private final HiDAO hiDAO;

    @Autowired
    public HiController(HiDAO hiDAO) {
        this.hiDAO = hiDAO;
    }

    @GetMapping
    public ResponseEntity hi(){
        return ResponseEntity.ok().body("hi");
    }

    //add this later and repackage/rebuild
    @PostMapping
    public ResponseEntity hey(@RequestBody String s){
        return ResponseEntity.ok().body("You said " + s + "???");
    }

    //GET all digimon - any GET requests to /digimon will go here
    @GetMapping(value="/digimon")
    public ResponseEntity<List<Digimon>> getAllDigimon(){

        return ResponseEntity.ok(hiDAO.findAll()); //.ok() returns a 200 level status code

    }

}
