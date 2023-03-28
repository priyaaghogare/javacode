package com.employ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testobj {

	public static void main(String[] args) {
		
		
		System.out.println("welcome demo ");
		
		Employee e=new Employee();
		e.setEmpid(1);
		e.setEname("ABC");
		e.setEmpsalary(1000);
		
		System.out.println("e1===="+e);
		
		ApplicationContext c=new ClassPathXmlApplicationContext("abc.xml");
		Employee e2=(Employee) c.getBean("emp1");
		System.out.println("e2===="+e2);
	}
}
