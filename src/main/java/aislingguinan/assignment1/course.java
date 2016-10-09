/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aislingguinan.assignment1;

import java.util.*;
import org.joda.time.*;

public class course {
    String id;
    String name;
    List<module> modules = new ArrayList<>();
    LocalDate start;
    LocalDate end;
    
    public course(String id, String name, List<module> modules, LocalDate start, LocalDate end){
        this.id = id;
        this.name = name;
        this.modules = modules;
        this.start = start;
        this.end = end;
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
    
    public void addModule(module module){
        modules.add(module);
    }
    
    public List listModule(){
        return modules;
    }
    
    public LocalDate getStart(){
        return start;
    }
    
    public LocalDate getEnd(){
        return end;
}
}
