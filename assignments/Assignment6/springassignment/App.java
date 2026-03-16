package com.demo.springassignment;

import com.demo.springassignment.entities.Employee;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Staring Application....." );
		ApplicationContext ac = new ClassPathXmlApplicationContext("springConf.xml");
        
        Employee e = (Employee)ac.getBean("emp1");
        //Employee e = ac.getBean(Employee.class);
        
        System.out.println(e);
        System.out.println( "Closing Application....." );
    }
}
