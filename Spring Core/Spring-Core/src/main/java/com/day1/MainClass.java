package com.day1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {

	public static void main(String[] args) {
		
		//Method -1 Using Resource
		
//(		Resource resource = new ClassPathResource("Beans.Xml");
//		BeanFactory factory = new XmlBeanFactory(resource);,
		
//		Employee emp1 = (Employee) factory.getBean("emp1");
//		System.out.println(emp1);
//
//		Employee emp2 = (Employee) factory.getBean("emp2");
//		System.out.println(emp2);
//		Employee emp3 = (Employee) factory.getBean("emp3");
//		System.out.println(emp3);
		
		//Method -2 Using context
		ApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
		
		Employee emp1 = (Employee) context.getBean("emp1");
		System.out.println(emp1);
		
		Employee emp2 = (Employee) context.getBean("emp2");
		System.out.println(emp2);
		
		Employee emp3 = (Employee) context.getBean("emp3");
		System.out.println(emp3);
		
		Employee emp4 = (Employee) context.getBean("emp4");
		System.out.println(emp4);
		
		Question q1=(Question)context.getBean("question1");
		System.out.println(q1);
		
		Question q2=(Question)context.getBean("question2");
		System.out.println(q2);
		
		Book book =(Book)context.getBean("book1");
		System.out.println(book);
		
		Book book1=(Book)context.getBean("book2");
		System.out.println(book1);
		
		Hello hello=(Hello) context.getBean("hello1");
		System.out.println(hello.getMsg());
		
		Hello hello1=(Hello) context.getBean("hello1");
		hello1.setMsg("Welcome");
		System.out.println(hello1.getMsg());
		
		Hello hello2=(Hello) context.getBean("hello1");
		hello2.setMsg("hi");
		System.out.println(hello2.getMsg());
		
		

	}

}
