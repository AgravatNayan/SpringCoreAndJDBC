package com.SpringCore.main;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Collections {

	private String empName;
	private List<String> address;
	private Set<String> phones;
	private Map<String, String> courses;
	private Properties prop;
	private empInformation empInformation;
	
	public Collections(empInformation empInformation)
	{super();
	this.empInformation = empInformation;
	System.out.println(empInformation);
		
	}

	public empInformation getEmp() {
		return empInformation;
	}

	public void setEmp(empInformation emp) {
		this.empInformation = emp;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public Set<String> getPhones() {
		return phones;
	}

	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	

	@Override
	public String toString() {
		return "Collections [empName=" + empName + ", address=" + address + ", phones=" + phones + ", courses="
				+ courses + ", prop=" + prop + ", emp=" + empInformation + "]";
	}

	public Collections(String empName, List<String> address, Set<String> phones, Map<String, String> courses) {
		super();
		this.empName = empName;
		this.address = address;
		this.phones = phones;
		this.courses = courses;
	}

	public Collections() {
		super();
		// TODO Auto-generated constructor stub
	}

}
