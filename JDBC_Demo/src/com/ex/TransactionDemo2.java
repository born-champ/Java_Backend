package com.ex;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionDemo2 {

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
            PreparedStatement ps=connection.prepareStatement("insert into abc values(?, ?);");  
            
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
            while(true){  
              
            System.out.println("enter id");  
            String s1=br.readLine();  
            int id=Integer.parseInt(s1);  
              
            System.out.println("enter name");  
            String name=br.readLine();  
            
//            System.out.println("enter Address");  
//            String address=br.readLine();  
//            
//            System.out.println("enter Avg");  
//            String s2=br.readLine();  
//            int avg=Integer.parseInt(s2);  
//           // int avg=Integer.parseInt(avg);  

            ps.setInt(1,id);  
            ps.setString(2,name);  
          
            ps.executeUpdate();  
            
            System.out.println("commit/rollback");  
            String answer=br.readLine();  
            if(answer.equals("commit")){  
            connection.commit();  
            }  
            if(answer.equals("rollback")){  
            connection.rollback();  
            }  

System.out.println("Want to add more records y/n");  
            String ans=br.readLine();  
            if(ans.equals("n")){  
            break;  
            }  
            
            }  
            connection.commit();  
            System.out.println("record successfully saved");  
              
            connection.close();//before closing connection commit() is called  
        }catch (Exception e) {
            // TODO: handle exception
        }
}
	}


