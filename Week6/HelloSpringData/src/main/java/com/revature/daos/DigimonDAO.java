package com.revature.daos;

import com.revature.models.Digimon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*By extending JpaRepository, we get access to various DAO methods that we don't need to create
  try to ctrl + click on JpaRepository to see what we have provided for us*/

/*JpaRepository takes two values in its generic - The object we're persisting, and the type of the PK*/

@Repository
public interface DigimonDAO extends JpaRepository<Digimon, Integer> {

    //This is our entire DAO for now... showing custom DAO method below

}
