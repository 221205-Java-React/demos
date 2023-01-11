package com.revature.daos;

import com.revature.models.Digimon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/*By extending JpaRepository, we get access to various DAO methods that we don't need to create
  try to ctrl + click on JpaRepository to see what we have provided for us*/

/*JpaRepository takes two values in its generic - The object we're persisting, and the type of the PK*/

@Repository
public interface DigimonDAO extends JpaRepository<Digimon, Integer> {

    //This is our entire DAO for now... showing custom DAO method below

    //I want to find all digimon of a certain name
    //Unfortunately, we have to define this on our own because JpaRepository only knows the Primary Key^
    //BUT Spring Data is smart enough to implement this method for us
    public Optional<List<Digimon>> findByDigimonName(String name);

    //HOW DOES THIS WORK?
    //By having a method name starting with "findBy" and ending in the variable you want to find by!!
    //Spring needs your method name to be in camelCase, or it will throw vague errors
    //Your variable names cannot have underscores

    //there are a lot of options for custom methods, google it if you wish.

}
