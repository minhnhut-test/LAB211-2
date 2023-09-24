/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer.CrewAssignmentDao;


import BussinessLayer.Components.DataValidation;
import BussinessLayer.Entity.CrewAssignment;
import DataLayer.IFileManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author nhutm
 */
public class CrewAssignmentDao implements ICrewAssignmentDao<CrewAssignment>{
    IFileManager<CrewAssignment> fileManager;
    List<CrewAssignment> crewAssignmentList = new ArrayList<>();
    DataValidation validation = new DataValidation();
    
    public CrewAssignmentDao() {
    }

    public CrewAssignmentDao(IFileManager<CrewAssignment> fileManager) {
        this.fileManager = fileManager;
    }
    
    
    @Override
    public void loadDataFromFile() throws Exception {
        String idFlight, idCrew, position;
        Date departureTime;
        
        List<String> crewAssignmentData = fileManager.readDataFromFile();
        for(String e : crewAssignmentData){
            List<String> crewAssignment = Arrays.asList(e.split(","));
            idFlight = crewAssignment.get(0).trim();
            idCrew = crewAssignment.get(1).trim();
            position = crewAssignment.get(2).trim();
            departureTime = validation.executeNullDate(crewAssignment.get(3).trim());
            
           CrewAssignment newCrewAssignment = new CrewAssignment(idFlight, idCrew, position, departureTime);
            addNew(newCrewAssignment);
        }
    }

   
    @Override
    public void addNew(CrewAssignment newCrewAssignment) throws Exception {
       crewAssignmentList.add(newCrewAssignment);
    }

    @Override
    public List<CrewAssignment> getList() throws Exception {
        if(crewAssignmentList.isEmpty()){
            throw new Exception("CrewAssignment list is empty.");
        }
        return crewAssignmentList;
    }

    @Override
    public void delete(int index) throws Exception {
       crewAssignmentList.remove(index);
    }

    @Override
    public void update(int index, CrewAssignment newCrewAssignment) throws Exception {
        crewAssignmentList.set(index, newCrewAssignment);
    }
    
    
}
