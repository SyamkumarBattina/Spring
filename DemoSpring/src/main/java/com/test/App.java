package com.test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("web.xml");     
    	Student s1=(Student)context.getBean("studentBean");//setter
    	Student s2=(Student)context.getBean("studentBean1");//Constructor
    	Employee E1=(Employee)context.getBean("employeeBean");//Setter
    	Employee E2=(Employee)context.getBean("employeeBean1");//Constructor
    	
    	System.out.println(s1);
    	System.out.println(s2);
    	System.out.println(E1);
    	System.out.println(E2);
        
       
    }
}
