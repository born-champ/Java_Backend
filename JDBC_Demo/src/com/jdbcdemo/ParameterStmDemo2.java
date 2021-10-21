package com.jdbcdemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ParameterStmDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		 try {
	            connection = DriverManager
	                .getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "root");
	            System.out.println("SQL Connection to database established!");
	           // Statement stm=connection.createStatement();
	           
	            	PreparedStatement ps = connection.prepareStatement("insert into abc values(?, ?);");
	            	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	            	 do {
	            		 System.out.println("enter student number");
	            		 int id= Integer.parseInt(bf.readLine());
	            		 System.out.println("Eneter name: ");
	            		 String name = bf.readLine();
	            		 ps.setInt(1, id); ps.setString(2, name);
	            		 int i = ps.executeUpdate();
	            		 System.out.println(1+ " updated");
	            		 System.out.println("want to continue: y/n");
	            		 String s = bf.readLine();
	            		 if(s.startsWith("n")) {
	            			 break;
	            		 }
	            		 
	            	 }while(true);
	            	 
		 }catch(Exception e){
	        	
	        }

		}

	}
