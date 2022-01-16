package com.SpringCore.StandaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
			
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		App app = context.getBean("Stan_Collection",App.class);
		
		
		System.out.println(app.getName());
		System.out.println(app.getName().getClass().getName());
		System.out.println("*******************************************************");
		System.out.println(app.getFree());
		System.out.println(app.getFree().getClass().getName());
		System.out.println("*******************************************************");
		System.out.println(app.getProp());
		System.out.println(app.getProp().getClass().getName());
	}
}
