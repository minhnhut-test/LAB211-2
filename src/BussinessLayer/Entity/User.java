/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLayer.Entity;

/**
 *
 * @author nhutm
 */
public abstract class User {
    protected String id;
    protected String name;
    protected String email;
    
    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
     
    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toTilteCase(String value){
        String s = "";
        value = value.trim().replaceAll("\\s+", " ").toLowerCase();
        String[] words = value.split(" ");
        for (String word : words) {
            char[] arr = word.toCharArray();
            arr[0] = Character.toUpperCase(arr[0]);
            s = s + new String(arr) + " ";
        }
        return s.trim();
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", id,name,email);
    }
    
    
}
