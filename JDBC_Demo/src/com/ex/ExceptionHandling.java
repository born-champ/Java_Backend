package com.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------- MySQL JDBC Connection Demo ------------");
		 Statement stm = null;
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
        
            stm=connection.createStatement();
            String sql = "select id, name, address from info_table;";
            stm.executeUpdate("create table info_table(id int, name varchar(25), "
            		+ "address varchar(25));");
            stm.executeUpdate("insert into info_table(101, 'Shubhi', 'Mumbai');");
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()) {
            	int id = rs.getInt(1); String name = rs.getString(2); String address = rs.getString(3);
            	System.out.println("ID :"+id + "Name : "+name + "Address : " +address );
            	connection.close(); stm.close();
            	rs.close();
            	
            	
            	
            }
            
            
            
           
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        } catch(Exception e) {
        	e.printStackTrace();
        } finally {
        	try {
        	if(stm!=null) {
        		stm.close();
        		
        	}
        	}catch(Exception e) {
        		
        	}
        }
    }
}

