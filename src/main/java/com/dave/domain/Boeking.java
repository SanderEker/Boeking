package com.dave.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;@Entity

public class Boeking {    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String arrival;
    private String departure;
    private int highscore;
    
    public int getId() {
        return id;
    }
//    private void setId(int id) {
//        this.id = id;
//    }
    public String getArrival() {
        return arrival;
    }
    public void setArrival(String date) {
        this.arrival = date;
    }
    public String getDeparture() {
        return departure;
    }
    public void setDeparture(String dprture) {
        this.departure = dprture;
    }
    public int getHighscore() {
        return highscore;
    }
    public void setHighscore(int highscore) {
        this.highscore = highscore;
    }
    
    
}


