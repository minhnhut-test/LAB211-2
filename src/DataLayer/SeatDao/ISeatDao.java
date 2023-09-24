/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer.SeatDao;

import DataLayer.IUserDao;

/**
 *
 * @author nhutm
 * @param <Seat>
 */
public interface ISeatDao<Seat> extends IUserDao<Seat> {
     void loadDataFromFile() throws Exception ;
}
