package com.training.dao;

import java.sql.SQLException;
import java.util.List;

import com.training.model.servletsPojo;

public interface Form {


		    public void servelts()throws ClassNotFoundException, SQLException;

            public void DeleteEmployee()throws ClassNotFoundException, SQLException;
    		public List<servletsPojo> retriveDetails() throws ClassNotFoundException, SQLException;
            public void Update()throws ClassNotFoundException, SQLException;

    			
    		
    		
		
    		}




