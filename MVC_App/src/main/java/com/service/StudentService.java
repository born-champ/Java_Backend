package com.service;

import java.util.List;

import com.dao.StudentDao;
import com.entity.Student;

public class StudentService {
	StudentDao studentDao=new StudentDao();
	public String storeStudentData(Student student) {
		if (studentDao.storeStudentData(student)) {
			return "Student Record Seccess";
			
		} else {
			return "Didn't Store";

		}
		
	}
	public List<Student>getAllStudentDetails(){
		return studentDao.getAllStudentInfo();
	}

}
