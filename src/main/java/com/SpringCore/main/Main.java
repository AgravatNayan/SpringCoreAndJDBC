package com.SpringCore.main;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		// Student student = (Student) context.getBean("student");
		// System.out.println(student);
		Collections con = context.getBean("collection",Collections.class);
		//Properties addresslist = con.getProp();
		
		//addresslist.setProperty("Name", "Agravat name");
		
		//con_injection con = (con_injection) context.getBean("demo_injection");
		//context.registerShutdownHook();
		
		System.out.println(con);

	}
}
