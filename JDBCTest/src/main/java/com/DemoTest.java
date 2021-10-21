package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("connection ready");
			Connection connection = DriverManager
	                .getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "root");
	            System.out.println("SQL Connection to database established!");
	            Statement stmt=connection.createStatement();
	            int res=stmt.executeUpdate("insert into student values(1, 'Ashu', 22)");
	            if (res>0) {
	            	System.out.println("data inserted succesfully");
					
				}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
