package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
//        System.out.println("name        : " + add1.getName());
//        System.out.println("phoneno : " + add1.getPhoneno());
//        System.out.println("email       :"+add1.getEmail());
//        System.out.println("password       :"+add1.getPassword());

        int rows = ps.executeUpdate();
        System.out.println(rows + " rows inserted");
    }
            
	        
	      

	@Override
	public void servelts() {
		// TODO Auto-generated method stub
		
	}




	public static void insert(servletsPojo details) {
		// TODO Auto-generated method stub
		
	}




	}


