//DAO CLASS CAN BE KNOWN AS THE KITCHEN IN THE RESTURANT MODEL
//THIS IS THE PLACE WHERE ALL THE ORDERS OF THE CUSTOMER COMES
package com.example.Daopractse.Dao;

import com.example.Daopractse.entity.Student;
import java.util.ArrayList;
import java.util.List;
import com.example.Daopractse.daoimpl.StudentDao;

/**
 *
 * @author HOME
 */
public class StudentDaoImpl implements StudentDao{
    
    List<Student> stdList=new ArrayList<Student>();

    @Override
    public List<Student> getall() {
     return stdList;
    }

    @Override
    public boolean insert(Student student) {
        return stdList.add(student);
    }

    @Override
    public boolean delete(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> searchById(String param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
