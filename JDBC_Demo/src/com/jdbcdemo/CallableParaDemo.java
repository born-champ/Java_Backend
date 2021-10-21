package com.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.CallableStatement;

public class CallableParaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		 try {
	            connection = DriverManager
	                .getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "root");
	            System.out.println("SQL Connection to database established!");
	           // Statement stm=connection.createStatement();
	            CallableStatement st = (CallableStatement) connection.prepareCall("{call emp_op()}");
	          
	            
	            

	}catch(Exception e){
   	
   }

}

}
