package com.example.Daopractse.ServiceClass;

import com.example.Daopractse.entity.Student;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
public interface StudentService {
    
    List<Student> getall();
    boolean insert(Student student);
    boolean delete(Student student);
    Student getById(int id);
    List<Student> searchById(String param);
   
    
    
    
}
