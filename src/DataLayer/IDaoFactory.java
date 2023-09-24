/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import DataLayer.CrewAssignmentDao.ICrewAssignmentDao;
import DataLayer.CrewDao.ICrewDao;
import DataLayer.CustomerDao.ICustomerDao;
import DataLayer.FlightDao.IFlightDao;
import DataLayer.SeatDao.ISeatDao;

/**
 *
 * @author nhutm
 */
public interface IDaoFactory {
    ICrewAssignmentDao crewAssignmentDao() throws Exception;
    ICustomerDao customerDao() throws Exception;
    ICrewDao crewDao() throws Exception;
    IFlightDao flightDao() throws Exception;
    ISeatDao seatDao() throws Exception;
}
