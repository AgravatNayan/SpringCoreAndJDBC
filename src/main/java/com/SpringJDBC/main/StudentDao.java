package com.SpringJDBC.main;

import java.util.List;

public interface StudentDao {

	public int of_insert(Student student);

	public int of_update(Student student);

	public int of_delete(int student_id);

	public Student of_select(int student_id);

	public List<Student> of_selectall();

}
