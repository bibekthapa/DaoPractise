// SERVICE LAYER IS FOR THE PURPOSE OF CACHING
//IN RESTURANT MODEL THE CUSTOMER ORDERS THE FOOD AND THE ORDER IS TAKEN BY THE WAITER
//WAITER WORKS AS THE MEDIATOR BETWEEN THE CUSTOMER AND CHEF

package com.example.Daopractse.Service.serviceimpl;

import com.example.Daopractse.Dao.StudentDaoImpl;
import com.example.Daopractse.ServiceClass.StudentService;
import com.example.Daopractse.entity.Student;
import java.util.List;

/**
 *
 * @author HOME
 */
public class StudentServiceImpl implements StudentService {
        StudentDaoImpl studentdao=new StudentDaoImpl();
    @Override
    public List<Student> getall() {
       return studentdao.getall();
    }

    @Override
    public boolean insert(Student student) {
       return studentdao.insert(student);
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
