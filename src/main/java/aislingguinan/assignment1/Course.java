package aislingguinan.assignment1;

import java.util.*;
import org.joda.time.*;

public class Course {
    String id;
    String name;
    List<Module> modules = new ArrayList<>();
    LocalDate start;
    LocalDate end;
    
    public Course(String id, String name, Module [] modules, LocalDate start, LocalDate end){
        this.id = id;
        this.name = name;
        for(int i=0;i<modules.length;i++){
            this.modules.add(modules[i]);
        }
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
    
    public void addModule(Module module){
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
