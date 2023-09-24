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
public class Customer extends User{
    private String address;
    private Date brithday;
    private String nationality;
    private String seat;
    private String status;
    private String idFlight;

    public Customer(String id, String name, String email,String address, Date brithday, String nationality, String seat, String status, String idFlight) {
        super(id, name, email);
        this.address = address;
        this.brithday = brithday;
        this.nationality = nationality;
        this.seat = seat;
        this.status = status;
        this.idFlight = idFlight;
    }
    
    
    public Customer(String name, String email,String address, Date brithday, String nationality, String seat, String status, String idFlight) {
        super(name, email);
        setId(id);
        this.address = address;
        this.brithday = brithday;
        this.nationality = nationality;
        this.seat = seat;
        this.status = status;
        this.idFlight = idFlight;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(String idFlight) {
        this.idFlight = idFlight;
    }

    @Override
    public String getId() {
        return id;
    }
    
    public void setId(String id, String idFlight, String seat){
        this.id = (idFlight+"-"+seat).trim();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %s, %s, %s, %s, %s",getId(),getIdFlight(),getName(),getEmail(),getAddress(),getBrithday(),getNationality(),getSeat(),getStatus());
    }
    
    
}
