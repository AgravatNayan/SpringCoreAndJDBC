package com.SpringJDBC.main;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class MainClass {
	public static void main(String[] args) throws SQLException {

		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("com/SpringJDBC/main/config.xml");

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		// JdbcTemplate jdbctemplate = context.getBean("jdbctemplate",
		// JdbcTemplate.class);

		// String ls_query = "INSERT INTO student_info (ID,ADDRESS,NAME) VALUES(?,?,?)
		// ";
		//
		// jdbctemplate.update(ls_query,123123,"Dwarks","Nayan");

		// jdbctemplate .getDataSource().getConnection().commit();

		StudentDao studentduo = context.getBean("studentImpl", StudentDao.class);

		// Student student = new Student();
		// student.setId(11111);
		// student.setName("Nayan Agravat");
		// student.setAddress("Ahmedabad");
		//
		// int ll_row = studentduo.of_insert(student);
		// System.out.println("Row Inserted : " + ll_row);

		// Student student = new Student();
		// student.setId(11111);
		// student.setAddress("Okha");

		// int ll_row = studentduo.of_delete(11111);

		// Student student = studentduo.of_select(1);

		List<Student> student_list = studentduo.of_selectall();

		for (Student student2 : student_list) {
			System.out.println("Selected Data :" + student2);
		}

	}
}
