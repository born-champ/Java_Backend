package com.main;

import java.util.Iterator;
import java.util.List;

import com.entity.Student;
import com.service.StudentService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student ss=new Student();
//			ss.setSid(4);
//		ss.setName("Jyoti");
//		ss.setAge(18);
//		StudentService ser=new StudentService();
//		String result=ser.storeStudentInfo(ss);
//		System.out.println(result);

		
//		ss.setSid(3);
//
//		ss.setAge(29);
//		StudentService ser=new StudentService();
//		String result=ser.updateStudentInfo(ss);
//		System.out.println(result);
//		
//		StudentService ser=new StudentService();
//		String result=ser.deleteStudentInfo(5);
//		System.out.println(result);
		
		StudentService ser=new StudentService();
		
//		Student ss1=ser.getStudentInfo(6);
//		System.out.println(ss1);
		
//		ser.getAllStudents().forEach(s->System.out.println(s));
		
		List<Student> listofstd=ser.getAllStudentDetails();
		Iterator<Student> li=listofstd.iterator();
		while (li.hasNext()) {
			Student ss =li.next();
			System.out.println(ss);
			
		}
		

	}

}
