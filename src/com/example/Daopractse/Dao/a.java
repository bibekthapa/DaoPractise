//THIS IS THE PLACE WHERE THE CHEF SITS. THEY MAKE THE FOOD
//REMEMBER CONTENT OF THE IMPLEMENTATION OF THE SERVICE PROVIDER AND THE DAO ARE  SAME
package com.example.Daopractse.Dao;

import com.example.Daopractse.entity.Student;
import java.util.List;

/**
 *
 * @author HOME
 */
public interface a {
    List<Student> showall();
    boolean insert(Student student);
    boolean delete(Student student);
    Student getById(int id);
    List<Student> searchById(String param);
    
}
