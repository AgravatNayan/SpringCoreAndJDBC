package com.SpringCore.main;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class con_injection /*implements DisposableBean,InitializingBean*/{
	private String name;
	private String address;
	private List<String> phone;
	
//	public void start() {
//		System.out.println("Start");
//	}
//	
//	public void end() {
//		System.out.println("End");
//	}
	
	con_injection(String name, String address, List phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "con_injection [name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}

	@PreDestroy
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}

	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Init");
	}

	

}
