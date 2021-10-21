package com.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Exception_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------- MySQL JDBC Connection Demo ------------");
		String updateQ = "update abc set name ='Ashu ' where id=101;" ;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } 
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found !!");
            return;
        }
        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;
        try {
            connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "root");
            System.out.println("SQL Connection to database established!");
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

