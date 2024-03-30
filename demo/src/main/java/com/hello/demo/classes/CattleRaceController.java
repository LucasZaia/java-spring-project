package com.hello.demo.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.demo.db.CattleRace;
import com.hello.demo.services.CattleRaceService;

@RestController
@RequestMapping(consumes = "application/json", value = "/test")
public class CattleRaceController {

    @Autowired
    private CattleRaceService cattleRaceService;

    @GetMapping
    public ResponseEntity<?> get_users () {
        List<CattleRace> races = cattleRaceService.list();

        return new ResponseEntity<>(races, HttpStatus.OK);
    }
    
}
