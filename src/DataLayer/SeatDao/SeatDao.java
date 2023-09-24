/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer.SeatDao;

import BussinessLayer.Entity.Seat;
import DataLayer.IFileManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author nhutm
 */
public class SeatDao implements ISeatDao<Seat>{
    IFileManager<Seat> fileManager;
    List<Seat> seatList = new ArrayList<>();
    
    public SeatDao() {
    }

    public SeatDao(IFileManager<Seat> fileManager) throws Exception {
        this.fileManager = fileManager;
        loadDataFromFile();
    }
    
    
    @Override
    public void loadDataFromFile() throws Exception {
       String idFlight,idReservation,seat;
       List<String> setData = fileManager.readDataFromFile();
        for (String e : setData) {
            List<String> emp = Arrays.asList(e.split(","));
            idFlight = emp.get(0).trim();
            idReservation = emp.get(1).trim();
            seat = emp.get(2).trim();
            Seat newSeat = new Seat(idFlight, idReservation, seat);
            addNew(newSeat);
        }
    }

    @Override
    public void addNew(Seat seat) throws Exception {
        seatList.add(seat);
    }

    @Override
    public List<Seat> getList() throws Exception {
       if(seatList.isEmpty()){
           throw new Exception("Seat list is empty.");
       }
       return seatList;
    }

    @Override
    public void delete(int index) throws Exception {
        seatList.remove(index);
    }

    @Override
    public void update(int index, Seat newSeat) throws Exception {
        seatList.set(index, newSeat);
    }
    
}
