package com.training.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class democonnection {

			   
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/productlogin", "root",
				"Jay@0917");
		return connection;

	}
}
        
     
	       
	       
	     
	         
	            
	            
	    


