package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.training.model.servletsPojo;
import com.training.util.democonnection;

public  class Form1 implements Form{

	public void Serveltd(servletsPojo add1) throws ClassNotFoundException, SQLException {
        // TODO Auto-generated method stub
        Connection con = democonnection.getConnection();
        String add = "insert into demo(name, phoneno,email,password)values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(add);
        ps.setString(1, add1.getName());
        ps.setString(2, add1.getPhoneno());
        ps.setString(3, add1.getEmail());
        ps.setString(4, add1.getPassword());
        int rows = ps.executeUpdate();
        System.out.println(rows + " rows inserted");
    }

		public List<servletsPojo> retriveDetails() throws ClassNotFoundException, SQLException 
	    {
	        ArrayList<servletsPojo> list=new ArrayList<>();
	        Connection connection=democonnection.getConnection();
	        String select="select name,phoneno,email,password from demo";
	        PreparedStatement prepareStatement=connection.prepareStatement(select);
	        ResultSet resultSet=prepareStatement.executeQuery();
	        while(resultSet.next())
	        {
	            String name=resultSet.getString(1);
	            String phoneNumber=resultSet.getString(2);
	            String email=resultSet.getString(3);
	            String password=resultSet.getString(4);
	            servletsPojo details=new servletsPojo();
	            details.setName(name);
	            details.setPhoneno(phoneNumber);
	            details.setEmail(email);
	            details.setPassword(password);

	            list.add(details);
	        }
	        connection.close();
	        return list;
	    }

//		
		
//		}		
//		@Override
//		public void update() throws ClassNotFoundException, SQLException {
//			public static void update(String price) throws ClassNotFoundException, SQLException{         
//		        Connection connection = Userconnection.getConnection();
//		      System.out.println(connection);
//		      System.out.println("Enter a price");
//		      Scanner sc = new Scanner(System.in);
//		      price= sc.next();
//		      String save="UPDATE admin SET  price =?  WHERE id=1";
//		      PreparedStatement prepareStatement = connection.prepareStatement(save);
//		      prepareStatement.setString(1, price);
//		      int rows = prepareStatement.executeUpdate();
//		      System.out.println(rows+" updated");
//		  }			
//}
public void DeleteEmployee(String name) throws ClassNotFoundException, SQLException {
    Connection connection =  democonnection.getConnection();
    String delete="delete from demo where name=?";
    PreparedStatement preparedStatement = connection.prepareStatement(delete);
    preparedStatement.setString(1,name);
    int rows = preparedStatement.executeUpdate();
    System.out.println(rows+" deleted");

}
public void UpdateEmployee(String name,String email) throws ClassNotFoundException, SQLException {
    
    Connection connection = democonnection.getConnection();
    String save="UPDATE Employee SET email=? WHERE name=?";
    PreparedStatement prepareStatement = connection.prepareStatement(save);
    prepareStatement.setString(1, email);
    prepareStatement.setString(2, name);
    int rows = prepareStatement.executeUpdate();
    System.out.println(rows+" updated");

}

@Override
public void servelts() throws ClassNotFoundException, SQLException {
	// TODO Auto-generated method stub
	
}

@Override
public void DeleteEmployee() throws ClassNotFoundException, SQLException {
	// TODO Auto-generated method stub
	
}

@Override
public void Update() throws ClassNotFoundException, SQLException {
	// TODO Auto-generated method stub
	
}
}



