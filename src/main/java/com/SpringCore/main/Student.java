package com.SpringCore.main;

public class Student {
	private int StudentId;
	private String StudentName;
	private String Studentaddress;

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentaddress() {
		return Studentaddress;
	}

	public void setStudentaddress(String studentaddress) {
		Studentaddress = studentaddress;
	}

	@Override
	public String toString() {
		return "App [StudentId=" + StudentId + ", StudentName=" + StudentName + ", Studentaddress=" + Studentaddress
				+ "]";
	}

	public Student(int studentId, String studentName, String studentaddress) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		Studentaddress = studentaddress;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
