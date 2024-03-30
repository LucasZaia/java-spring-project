package com.hello.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.demo.db.CattleRace;
import com.hello.demo.repository.CattleRaceRepository;

@Service
public class CattleRaceService {
    
    @Autowired
    private CattleRaceRepository cattleRaceRepository;

    public List<CattleRace> list() {
        return cattleRaceRepository.findAll();
    }
}
