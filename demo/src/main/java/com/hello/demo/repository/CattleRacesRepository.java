package com.hello.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hello.demo.db.CattleRaces;

@Repository
public interface CattleRacesRepository extends JpaRepository<CattleRaces, Long> {
    
}
