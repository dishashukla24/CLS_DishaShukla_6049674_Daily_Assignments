package com.demo.springassignment3;

import com.demo.springassignment3.entities.SBU;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Staring Application....." );
		ApplicationContext ac = new ClassPathXmlApplicationContext("springConf.xml");
        
		 SBU sbu1= (SBU) ac.getBean("sbu1");

	        System.out.println(sbu1);
        System.out.println( "Closing Application....." );
    }
}




