/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer.FlightDao;

import BussinessLayer.Components.DataValidation;
import BussinessLayer.Entity.Flight;
import DataLayer.IFileManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Date;

   /**
 *
 * @author nhutm
 */
public class FlightDao implements IFlightDao<Flight>{
    IFileManager<Flight> fileManager;
    List<Flight> flightList = new ArrayList<>();
    DataValidation validation = new DataValidation();
    
    public FlightDao() {
    }
    
    public FlightDao(IFileManager<Flight> fileManager) throws Exception {
        this.fileManager = fileManager;
        loadDataFromFile();
    }
    
    
    @Override
    public void loadDataFromFile() throws Exception {
        String idFlight, departureCity, destinationCity;
        Date departureTime,arrivalTime;
        int availableSeat,durationTime; 
        List<String> flightData = fileManager.readDataFromFile();
        for(String e :flightData ){
            List<String> flight = Arrays.asList(e.split(","));
            idFlight = flight.get(0).trim();
            departureCity = flight.get(1).trim();
            destinationCity = flight.get(2).trim();
            departureTime = validation.executeNullDate(flight.get(3).trim());
            arrivalTime = validation.executeNullDate(flight.get(4).trim());
            durationTime = Integer.parseInt(flight.get(5).trim());
            availableSeat = Integer.parseInt(flight.get(6).trim());
            
            Flight newFlight = new Flight(idFlight, departureCity, destinationCity, departureTime, arrivalTime, durationTime,availableSeat);
            addNew(newFlight);
        }
    }

    @Override
    public void addNew(Flight newFlight) throws Exception {
        flightList.add(newFlight);
    }

    @Override
    public List<Flight> getList() throws Exception {
       if(flightList.isEmpty()){
           throw new Exception("Flight list is empty");
       }
       return flightList;
    }

    @Override
    public void delete(int index) throws Exception {
      flightList.remove(index);
    }

    @Override
    public void update(int index, Flight newFlight) throws Exception {
        flightList.set(index, newFlight);
    }
    
}
