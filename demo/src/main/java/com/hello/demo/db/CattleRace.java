package com.hello.demo.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import jakarta.persistence.Table;

@Entity(name = "CattleRace")
@Table(name = "cattle_races")
public class CattleRace {
    @Id
    @GeneratedValue
    private Long id;
    private String race;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }
}
