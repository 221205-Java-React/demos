package com.revature.daos;

import com.revature.models.Digimon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HiDAO extends JpaRepository<Digimon, Integer> {
}
