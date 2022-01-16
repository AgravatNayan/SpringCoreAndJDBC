package com.SpringCore.Stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("app")
@Scope("singleton")
public class App {
	@Value("Agravat Nayan")
	private String name;

	@Value("Ahmedabad")
	private String city;

	@Value("#{namevalue}")
	private List<String> alname;

	@Value("#{ T(java.lang.Math).sqrt(144) }")
	private int rqrtval;

	public List<String> getAlname() {
		return alname;
	}

	public void setAlname(List<String> alname) {
		this.alname = alname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getRqrtval() {
		return rqrtval;
	}

	public void setRqrtval(int rqrtval) {
		this.rqrtval = rqrtval;
	}

	public App(String name, String city, List<String> alname) {
		super();
		this.name = name;
		this.city = city;
		this.alname = alname;
	}

	public App() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "App [name=" + name + ", city=" + city + ", alname=" + alname + ", rqrtval=" + rqrtval + "]";
	}

}
