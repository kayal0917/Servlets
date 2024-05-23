package com.training.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.model.servletsPojo;

/**
 * Servlet implementation class Deleteservlet
 */
@WebServlet("/Deleteservlet")
public class Deleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<servletsPojo>list=new ArrayList<>();
	servletsPojo details=new servletsPojo();
	Form1 form=new Form1();

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        System.out.println(name);
            try 
            {  
            	form.DeleteEmployee(name);
                PrintWriter writer = response.getWriter();
                writer.println(details.getName() + "deleted");
                List<servletsPojo> list = form.retriveDetails();
    			request.setAttribute("list", list);
    		    request.getRequestDispatcher("NewFile.jsp").forward(request, response);
            } 
            catch (ClassNotFoundException | SQLException e) 
            {
                e.printStackTrace();
            }
          
}

	
	

	

}
