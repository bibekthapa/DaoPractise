package com.example.Daopractse;

import com.example.Daopractse.Service.serviceimpl.StudentServiceImpl;
import com.example.Daopractse.entity.Student;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import com.example.Daopractse.ServiceClass.StudentService;

/**
 *
 * @author HOME
 */
public class dao1 {

    public static void main(String[] args) {
       

       
        
       StudentService stdservice=new StudentServiceImpl();
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("1.Add the student");
            System.out.println("2.Delete the student");
            System.out.println("3.Show all");
            System.out.println("4.Search By id");
            System.out.println("5.Search");
            System.out.println("6.exit");
             Student student = new Student();
            //nextInt() is for the input of int only whereas if string input is needed then we have to use only next()
            switch (input.nextInt()) {
                case 1:
                   
                        
                    System.out.println("Enter the student id ");
                    student.setId(input.nextInt());

                    System.out.println("Enter the first name ");
                    student.setFirstName(input.next());
                    System.out.println("Enter the last name ");
                    student.setLastName(input.next());

                    System.out.println("Enter the address  ");
                    student.setAddress(input.next());
                    System.out.println("Enter the email ");
                    student.setEmail(input.next());
                    stdservice.insert(student);
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                     
                    for(Student s : stdservice.getall() )
                    {
                        System.out.println(s.toString( ));
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
            }

        }

    }

}
