/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLayer.Entity;

import java.util.Date;

/**
 *
 * @author nhutm
 */
public class CrewAssignment {
    private String idFlight;
    private String idCrew;
    private String position;
    private Date departureTime;

    public CrewAssignment() {
    }

    public CrewAssignment(String idFlight, String idCrew, String position, Date departureTime) {
        this.idFlight = idFlight;
        this.idCrew = idCrew;
        this.position = position;
        this.departureTime = departureTime;
    }

    public String getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(String idFlight) {
        this.idFlight = idFlight;
    }

    public String getIdCrew() {
        return idCrew;
    }

    public void setIdCrew(String idCrew) {
        this.idCrew = idCrew;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s",getIdFlight(),getIdCrew(),getPosition(),getDepartureTime());
    }
    
    
}
