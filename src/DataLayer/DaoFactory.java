/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import DataLayer.CrewAssignmentDao.CrewAssignmentDao;
import DataLayer.CrewAssignmentDao.ICrewAssignmentDao;
import DataLayer.CrewDao.CrewDao;
import DataLayer.CrewDao.ICrewDao;
import DataLayer.CustomerDao.CustomerDao;
import DataLayer.CustomerDao.ICustomerDao;
import DataLayer.FlightDao.FlightDao;
import DataLayer.FlightDao.IFlightDao;
import DataLayer.SeatDao.ISeatDao;
import DataLayer.SeatDao.SeatDao;

/**
 *
 * @author nhutm
 */
public class DaoFactory implements IDaoFactory{
    
    IFileManager fileManager;
    
    public DaoFactory(){
        
    }
    public DaoFactory(String inputDateFile){
        this.fileManager = new FileManager(inputDateFile);
    }
    @Override
    public ICrewAssignmentDao crewAssignmentDao() throws Exception {
        return new CrewAssignmentDao(fileManager);
    }

    @Override
    public ICustomerDao customerDao() throws Exception {
        return new CustomerDao(fileManager);
    }

    @Override
    public ICrewDao crewDao() throws Exception {
        return new CrewDao(fileManager);
    }

    @Override
    public IFlightDao flightDao() throws Exception {
        return new FlightDao(fileManager);
    }

    @Override
    public ISeatDao seatDao() throws Exception {
        return new SeatDao(fileManager);
    }
    
}
