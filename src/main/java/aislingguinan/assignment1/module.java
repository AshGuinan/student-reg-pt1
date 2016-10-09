/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aislingguinan.assignment1;

import java.util.*;

/**
 *
 * @author absin_000
 */
public class module {
    String id;
    String name;
    List<student> enrolledStudents = new ArrayList<>();
    
    
    public module(String id, String name, List<student> enrolledStudents){
        this.id = id;
        this.name = name;
        this.enrolledStudents = enrolledStudents;
    }
    
      public String getId(){
        return id;
    }
    
    public String setId(String id){
        this.id = id;
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void addStudent(student student){
        enrolledStudents.add(student);
    }
    public List listStudent(){
        return enrolledStudents;
    }
}
