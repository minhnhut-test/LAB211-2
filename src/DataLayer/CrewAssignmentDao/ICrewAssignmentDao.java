/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer.CrewAssignmentDao;

import DataLayer.IUserDao;

/**
 *
 * @author nhutm
 * @param <CrewAssignment>
 */
public interface ICrewAssignmentDao<CrewAssignment> extends IUserDao<CrewAssignment> {
     void loadDataFromFile() throws Exception ;
}
