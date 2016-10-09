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
public class Module {
    String id;
    String name;
    List<Student> enrolledStudents = new ArrayList<>();
    
    
    public Module(String id, String name, Student [] enrolledStudents){
        this.id = id;
        this.name = name;
        for(int i=0;i<enrolledStudents.length;i++){
            this.enrolledStudents.add(enrolledStudents[i]);
        }
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
    
    public void addStudent(Student Student){
        enrolledStudents.add(Student);
    }
    public List listStudent(){
        return enrolledStudents;
    }
}
