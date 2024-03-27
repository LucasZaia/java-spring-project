package com.hello.demo.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.demo.db.CattleRaces;
import com.hello.demo.services.CattleRacesService;

@RestController
@RequestMapping(consumes = "application/json", value = "/test")
public class CattleRacesController {

    @Autowired
    private CattleRacesService cattleRacesService;

    @GetMapping
    public ResponseEntity<?> get_users () {
        List<CattleRaces> races = cattleRacesService.list();

        return new ResponseEntity<>(races, HttpStatus.OK);
    }
    
}
