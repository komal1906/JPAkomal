package com.cg.spring.beans;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String args[])
	{
		/* we create object by using new operator.
		
		Employee emp= new Employee();
		
		emp.setFirstName("komal");
		emp.setLastName("agrawal");
		emp.setAge(20);
		System.out.println(emp);
		*/
	
		/* in this we dont create object by using new operator 
		 * in this we use beans.xml to define by using id nd name in beans.xml
		Resource res=new ClassPathResource("beans.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		
		Employee employee=(Employee) factory.getBean("e1");
		
		employee.setFirstName("komal");
		employee.setLastName("agrawal");
		employee.setAge(20);
		System.out.println(employee);
		*/
		
		/* in this seetting we done explicitly in the beans.xml file
		 and call all the parameters from the beans.xml file and 
		 define that parameters in property file in beans.xml
		 and by using setter injection
		 
		Resource res=new ClassPathResource("beans.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		
		Employee employee=(Employee) factory.getBean("e1");
		
		System.out.println(employee);
		*/
		
		/*
		//we using constructor injection in this by using both the methods
		//we also apply arrayList in this 
		Resource res=new ClassPathResource("beans.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		
		Employee employee=(Employee) factory.getBean("e1");
		
		System.out.println(employee);
		*/
		// for UserCredential in which we use hashMap
		Resource res=new ClassPathResource("beans.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		
		Employee user1=(Employee) factory.getBean("e1");
		Employee user2=(Employee) factory.getBean("e2");
		System.out.println(user1);
		System.out.println(user2);
	}

}












