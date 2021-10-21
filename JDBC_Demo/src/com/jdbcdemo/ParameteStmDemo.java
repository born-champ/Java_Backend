package com.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class ParameteStmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------- MySQL JDBC Connection Demo ------------");
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
           // Statement stm=connection.createStatement();
            	PreparedStatement ps = connection.prepareStatement("insert into abc values(?, ?);");
            	ps.setInt(1, 202);
            	ps.setString(2, "shubhi");
            	int x = ps.executeUpdate();
            	System.out.println(x+ " updated");
            	connection.close();
            	
            	
        }catch(Exception e){
        	
        }

	}

}
