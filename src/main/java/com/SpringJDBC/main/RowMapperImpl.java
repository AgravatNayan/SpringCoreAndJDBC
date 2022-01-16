package com.SpringJDBC.main;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements org.springframework.jdbc.core.RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

		Student student = new Student();
		student.setId(rs.getInt(1));
		student.setAddress(rs.getString(2));
		student.setName(rs.getString(3));

		return student;
	}

}
