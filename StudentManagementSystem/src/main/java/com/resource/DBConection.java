package com.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConection {
	static Connection connection;

	public static Connection getDBConection(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "root");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Db connection" +e);
		}
		// TODO Auto-generated method stub
		return connection;

	}

}
