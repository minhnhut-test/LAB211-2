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
public class Flight {
    private String idFlight;
    private String departureCity;
    private String destinationCity;
    private Date departureTime;
    private Date arrivalTime;
    private int durationTime;
    private int availableSeat;

    public Flight(String idFlight, String departureCity, String destinationCity, Date departureTime, Date arrivalTime, int durationTime, int availableSeat) {
        this.idFlight = idFlight;
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.durationTime = durationTime;
        this.availableSeat = availableSeat;
    }

    public Flight(String idFlight, String departureCity, String destinationCity, Date departureTime, Date arrivalTime, int availableSeat) {
        this.idFlight = idFlight;
        setDurationTime(departureTime, arrivalTime);
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.durationTime = durationTime;
        this.availableSeat = availableSeat;
    }
    
    public String getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(String idFlight) {
        this.idFlight = idFlight;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(int durationTime) {
        this.durationTime = durationTime;
    }
    
    public void setDurationTime(Date departureTime, Date arrivalTime) {
        
      
    }

    public int getAvailableSeat() {
        return availableSeat;
    }

    public void setAvailableSeat(int availableSeat) {
        this.availableSeat = availableSeat;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %s, %s, %s",getIdFlight(),getDepartureCity(),getDestinationCity(),getDepartureTime(),getArrivalTime(),getDurationTime(),getAvailableSeat());
    }
    
    
    
}
