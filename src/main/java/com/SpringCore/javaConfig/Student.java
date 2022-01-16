package com.SpringCore.javaConfig;

import java.util.List;

import org.springframework.stereotype.Component;

import com.SpringJDBC.main.StudentDao;

//@Component("student")
public class Student implements StudentDao {

	private Samosa samosa;

	public String demo() {
		System.out.println("Program is run!!!!");
		return "Hello How Are you!!!!";
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	@Override
	public String toString() {
		return "Student []";
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void study() {
		this.samosa.getDisplay();
		System.out.println("End!!!!!!!!!!!");
	}

	public int of_insert(com.SpringJDBC.main.Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int of_update(com.SpringJDBC.main.Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int of_delete(int student_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public com.SpringJDBC.main.Student of_select(int student_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<com.SpringJDBC.main.Student> of_selectall() {
		// TODO Auto-generated method stub
		return null;
	}

}
