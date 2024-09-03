package com.springAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springAOP.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ApplicationContext context = new ClassPathXmlApplicationContext("com/springAOP/config.xml");
		   Student student = (Student) context.getBean("student");
		   student.getName();
		   student.getAge();
		   student.printThrowException();
		   
	}

}
