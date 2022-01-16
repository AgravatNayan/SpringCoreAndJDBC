package com.SpringJDBC.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int of_insert(Student student) {

		String ls_sql = "INSERT INTO student_info (ID,ADDRESS,NAME) values(?,?,?)";
		int rowcnt = this.jdbcTemplate.update(ls_sql, student.getId(), student.getAddress(), student.getName());
		return rowcnt;
	}

	public int of_update(Student student) {
		String ls_sql = "UPDATE student_info SET ADDRESS=? WHERE ID=?";
		int rowcnt = this.jdbcTemplate.update(ls_sql, student.getAddress(), student.getId());
		return rowcnt;
	}

	public int of_delete(int student_id) {
		String ls_sql = "DELETE FROM student_info WHERE id=?";
		int rowcnt = this.jdbcTemplate.update(ls_sql, student_id);
		return rowcnt;
	}

	public Student of_select(int student_id) {
		String ls_sql = "SELECT * FROM student_info WHERE ID =?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(ls_sql, rowMapper, student_id);
		return student;
	}

	public List<Student> of_selectall() {
		String ls_sql = "SELECT * FROM student_info";
		List<Student> student = this.jdbcTemplate.query(ls_sql, new RowMapperImpl());
		return student;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
