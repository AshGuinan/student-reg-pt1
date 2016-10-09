package aislingguinan.assignment1;

import static java.lang.Integer.*;
import java.util.*;

public class Student {
    int id;
    String name;
    int age;
    String dob;
    String uName;
    //student constructor
    public Student(int id, String name,String dob){       
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.uName = "";
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        String [] y = dob.split("/");
        age = year-parseInt(y[2]);
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
    
    public String getDob(){
        return dob;
    }
    
    public void setDob(String date){
        this.dob = dob;
    }
    
    public String getUser(){
       return uName;
    }
    
    public void setUser(){
       String [] n1 = name.split("\\s");
       n1[0] = n1[0].substring(0,1);
       this.uName = n1[0]+"."+n1[1]+age;
    }
}

