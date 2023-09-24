/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer.FlightDao;

import DataLayer.IUserDao;



/**
 *
 * @author nhutm
 */
public interface IFlightDao<Flight> extends IUserDao<Flight> {
     void loadDataFromFile() throws Exception ;
}
