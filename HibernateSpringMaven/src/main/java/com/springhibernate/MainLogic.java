package com.springhibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
				
		ApplicationContext ac=new ClassPathXmlApplicationContext("springconfig.xml");
		EmployeeDao x=(EmployeeDao)ac.getBean("employee");
		Employee e = x.getDetails(102);
		
		
		//x.saveEmployee(e);
		
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());

       	}

}
