package com.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

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
            connection.setAutoCommit(false);
            Statement stm=connection.createStatement();
            stm.executeQuery("insert into abc values(105, 'Mohit') ;");
            
            connection.commit();
            connection.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}