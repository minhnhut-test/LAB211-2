/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer.CrewDao;

import DataLayer.IUserDao;

/**
 *
 * @author nhutm
 * @param <Crew>
 */
public interface ICrewDao<Crew> extends IUserDao<Crew> {
     void loadDataFromFile() throws Exception ;
}
