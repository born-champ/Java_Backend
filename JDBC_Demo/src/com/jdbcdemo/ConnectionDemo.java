package com.jdbcdemo;

import java.sql.*;

public class ConnectionDemo {

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
            Statement stm=connection.createStatement();
            ResultSet r1 = stm.executeQuery("select * from abc; ");
            while(r1.next()) {
            	System.out.println(r1.getInt(1)+ " " +r1.getString(2));
            }
 
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            return;
        } finally {
            try
            {
                if(connection != null)
                    connection.close();
                System.out.println("Connection closed !!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
