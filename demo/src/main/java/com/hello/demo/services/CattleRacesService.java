package com.hello.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.demo.db.CattleRaces;
import com.hello.demo.repository.CattleRacesRepository;

@Service
public class CattleRacesService {
    
    @Autowired
    private CattleRacesRepository cattleRacesRepository;

    public List<CattleRaces> list() {
        return cattleRacesRepository.findAll();
    }
}
