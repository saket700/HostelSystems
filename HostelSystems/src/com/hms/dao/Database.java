package com.hms.dao;
import java.sql.*;
public class Database {
     private static String url="jdbc:mysql://localhost/hms";
     private static String pass="root";
     private static String user="root";
     private static String driver="com.mysql.jdbc.Driver"; 
     private static Connection conn=null;
     private static boolean status=false;
     public static Connection getCon()
     {
    	 try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 try {
			conn=DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 return conn;
     }
     public static boolean getValidUser(String email,String password)
     {   String qry="Select * FROM admin WHERE email = '" +email + "'" +" And password='"+password+"'";
    	 conn=Database.getCon();
    	 try {
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(qry);
			if(rs.next())
			{
				status=true;
			}
			conn.close();	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
    	 return status;
    	 
     }
	
   }
