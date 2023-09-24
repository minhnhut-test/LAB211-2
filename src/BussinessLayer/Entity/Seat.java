/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLayer.Entity;

/**
 *
 * @author nhutm
 */
public class Seat {
    private String idFlight;
    private String idReservation;
    private String seat;

    public Seat() {
    }

    public Seat(String idFlight, String idReservation, String seat) {
        this.idFlight = idFlight;
        this.idReservation = idReservation;
        this.seat = seat;
    }

    public String getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(String idFlight) {
        this.idFlight = idFlight;
    }

    public String getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s",getIdFlight(),getIdReservation(),getSeat());
    }
    
    
}
