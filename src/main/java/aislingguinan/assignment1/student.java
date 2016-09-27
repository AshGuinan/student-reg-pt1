package aislingguinan.assignment1;

import java.util.Date;

/**
 *
 * @author absin_000
 */
public class student {
    int id;
    String name;
    Date dob;
    String uName;
    
    //student constructor
    public student(int id, String name, Date dob, String uName){
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.uName = "";
    }
    
    public int getId(){
        return id;
    }
    
    public int setId(int id){
        this.id = id;
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Date getDob(){
        return dob;
    }
    
    public void setDob(Date date){
        this.dob = dob;
    }
    
    public String getUser(){
       return "";
    }
    
    public void setUser(){
       
    }
}

