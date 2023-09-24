/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer.CrewDao;
import BussinessLayer.Entity.Crew;
import DataLayer.IFileManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author nhutm
 */
public class CrewDao implements ICrewDao<Crew>{
    IFileManager<Crew> fileManager;
    List<Crew> crewList = new ArrayList<>();

    public CrewDao() {
    }

    public CrewDao(IFileManager<Crew> fileManager) throws Exception {
        this.fileManager = fileManager;
        loadDataFromFile();
    }
    
    
    
    @Override
    public void loadDataFromFile() throws Exception {
        String idCrew, name, email, type;
        List<String> crewData = fileManager.readDataFromFile();
        for(String e : crewData){
            List<String> crew = Arrays.asList(e.split(","));
            idCrew = crew.get(0).trim();
            name = crew.get(1).trim();
            email = crew.get(2).trim();
            type = crew.get(3).trim();
            
            Crew newCrew = new Crew(idCrew, name, email, type);
            addNew(newCrew);
        }
    }

    @Override
    public void addNew(Crew newCrew) throws Exception {
        crewList.add(newCrew);
    }

    @Override
    public List<Crew> getList() throws Exception {
        if(crewList.isEmpty()){
            throw new Exception("Crew list is empty.");
        }
        return crewList;
    }

    @Override
    public void delete(int index) throws Exception {
        crewList.remove(index);
    }

    @Override
    public void update(int index, Crew newCrew) throws Exception {
        crewList.set(index, newCrew);
    }
    
}
