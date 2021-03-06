package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.Student;

@Repository
public class StudentDao {
	
//	@Autowired
//	DataSource ds;
//	
//	public int storeStudentRecord(Student std) {
//		try {
//			Connection con= ds.getConnection();
//			PreparedStatement psmt=con.prepareStatement("insert into student values(?,?,?,?)");
//			psmt.setInt(1, std.getSid());
//			psmt.setString(2, std.getName());
//			psmt.setInt(3, std.getSid());
//			psmt.setInt(4, 333);
//			return psmt.executeUpdate();
//			
//			
//			
//		} catch (Exception e) {
//			System.out.println(e);
//			return 0;
//			// TODO: handle exception
//		}
//	}

	@Autowired
	JdbcTemplate jdbcTemplate;
	public int storeStudentRecord(Student std) {
		try {
			return jdbcTemplate.update("insert into student values(?,?,?,?)",std.getSid(),std.getName(),std.getAge(),222);
			
			
		} catch (Exception e) {
			System.out.println(e);
			return 0;
			// TODO: handle exception
		}
	
		
	}
	
}
