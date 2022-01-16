package com.SpringCore.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan(basePackages = "com.SpringCore.javaConfig")
public class JavaConfig {

	@Bean
	public Samosa getsamosa() {
		return new Samosa();
	}

	@Bean(name = { "student", "temp" })
	public Student getStudent() {
		Student student = new Student(getsamosa());
		return student;
	}
}
