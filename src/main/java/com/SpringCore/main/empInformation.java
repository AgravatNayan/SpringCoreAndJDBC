package com.SpringCore.main;

public class empInformation {
	private int empId;
	private String empDepartment;
	private String empDesignation;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	@Override
	public String toString() {
		return "empInformation [empId=" + empId + ", empDepartment=" + empDepartment + ", empDesignation="
				+ empDesignation + "]";
	}

	public empInformation(int empId, String empDepartment, String empDesignation) {
		super();
		this.empId = empId;
		this.empDepartment = empDepartment;
		this.empDesignation = empDesignation;
	}

	public empInformation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 

}
