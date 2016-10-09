/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aislingguinan.assignment1;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author absin_000
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    /**
     * Test of getId method, of class Student.
     */
    @org.junit.Test
    public void testGetId() {
        System.out.println("getId");
        Student instance = new Student(1234, "john doe", "11/3/1993");
        int expResult = 1234;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Student.
     */
    @org.junit.Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student(1234, "john doe", "11/3/1993");
        String expResult = "john doe";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDob method, of class Student.
     */
    @org.junit.Test
    public void testGetDob() {
        System.out.println("getDob");
        Student instance = new Student(1234, "john doe", "11/3/1993");
        String expResult = "11/3/1993";
        String result = instance.getDob();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUser method, of class Student.
     */
    @org.junit.Test
    public void testGetUser() {
        System.out.println("getUser");
        Student instance = new Student(1234, "john doe", "11/3/1993");
        String expResult = "j.doe23";
        instance.setUser();
        String result = instance.getUser();
        assertEquals(expResult, result);
    }
    
}
