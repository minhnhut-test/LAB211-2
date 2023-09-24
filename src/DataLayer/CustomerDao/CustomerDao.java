/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer.CustomerDao;
import BussinessLayer.Components.DataValidation;
import BussinessLayer.Entity.Customer;
import DataLayer.IFileManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
/**
 *
 * @author nhutm
 */
public class CustomerDao implements ICustomerDao<Customer>{
    IFileManager<Customer> fileManager;
    List<Customer> customerList = new ArrayList<>();
    DataValidation validation = new DataValidation();
    
    public CustomerDao() {
    }

    public CustomerDao(IFileManager<Customer> fileManager) {
        this.fileManager = fileManager;
    }
    
    @Override
    public void loadDataFromFile() throws Exception {
        String idReservation, name, email, address, nationality,seat,status,idFlight;
        Date birthday;
        List<String> customerData = fileManager.readDataFromFile();
        for(String e : customerData){
            List<String> customer = Arrays.asList(e.split(","));
            idReservation = customer.get(0).trim();
            name = customer.get(1).trim();
            email = customer.get(2).trim();
            address = customer.get(3).trim();
            birthday = validation.executeNullDate(customer.get(4).trim());
            nationality = customer.get(5).trim();
            seat = customer.get(6).trim();
            status = customer.get(7).trim();
            idFlight = customer.get(8).trim();
            
            Customer newCustomer = new Customer(idReservation, name, email,address, birthday, nationality, seat, status, idFlight);
            addNew(newCustomer);
        }
    }

    @Override
    public void addNew(Customer newCustomer) throws Exception {
       customerList.add(newCustomer);
    }

    @Override
    public List<Customer> getList() throws Exception {
       if(customerList.isEmpty()){
           throw new Exception("Customer list is empty.");
       }
       return customerList;
    }

    @Override
    public void delete(int index) throws Exception {
        customerList.remove(index);
    }

    @Override
    public void update(int index, Customer newCustomer) throws Exception {
        customerList.set(index, newCustomer);
    }
    
}
