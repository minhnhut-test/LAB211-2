/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer.CustomerDao;

import DataLayer.IUserDao;

/**
 *
 * @author nhutm
 * @param <Customer>
 */
public interface ICustomerDao<Customer> extends IUserDao<Customer> {
     void loadDataFromFile() throws Exception ;
}
