package com.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoConcur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{
	            
			    Connection con = getConnection();    
			        Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
			                ResultSet.CONCUR_UPDATABLE);
			        stm.executeUpdate("create table abc(id int , name varchar(25));");
			        stm.executeUpdate("insert into abc values(1, 'Jyoti');");
			        stm.executeUpdate("insert into abc values(2,'null');");
			        stm=con.createStatement();
			        ResultSet rs = stm.executeQuery("select * from abc ");
			        
			        int concur = rs.getConcurrency();
			        System.out.println(concur);
			        rs.close();con.close();stm.close();
			        }
			        catch (Exception e) {
			            // TODO: handle exception
			        }
			    }
			    private static Connection getConnection() throws Exception {
			        Class.forName("com.mysql.cj.jdbc.Driver");  //step 1 
			        System.out.println("connection ready");
			        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
			        return DriverManager.getConnection(url,"root", "root");
			        
			    }
			

	}


