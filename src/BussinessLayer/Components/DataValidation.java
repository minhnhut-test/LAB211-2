/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLayer.Components;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author nhutm
 */
public final class DataValidation {
     SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm dd/MM/yyyy");
     
     
     
     //--------------------------------------------------------------
     public String executeNullDate(Date dateInput){
        String dateOutput ="";
        if(dateInput == null ){
                dateOutput ="\tN/A\t";
            }else{
                dateOutput = dateFormat.format(dateInput);
         }
        return dateOutput;
    }
    //--------------------------------------------------------------
    public Date executeNullDate(String dateInput) throws ParseException{
        Date dateOutput;
        
        if(dateInput == null || dateInput.equals("N/A")){
                dateOutput = null;
        }else{
            
                dateOutput = dateFormat.parse(dateInput);
        }
        return dateOutput;
    }
    //--------------------------------------------------------------
    public String executeInputStringDate(String str){
        String result = "";
        if(str.contains(":")){
            return str;
        }else{
            result = "00:00 " + str;  
        }
        return result;
    } 
}
