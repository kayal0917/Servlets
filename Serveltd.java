package com.training.dao;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.model.servletsPojo;
import com.training.util.democonnection;

/**
 * Servlet implementation class Serveltd
 */
@WebServlet("/Serveltd")
public class Serveltd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<servletsPojo>list=new ArrayList<>();
	servletsPojo details=new servletsPojo();
	
	
    /**
     * Default constructor. 
     */
    public Serveltd() {
    	super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Form1 form=new Form1();
        String name = request.getParameter("name");
        details.setName(name);

        String phoneno = request.getParameter("phoneno");
        details.setPhoneno(phoneno);
        String email=request.getParameter("email");
        details.setEmail(email);

        String password=request.getParameter("password");
        details.setPassword(password);

//        String parameter = request.getParameter("submit");
//        System.out.println(parameter);
//        servletsPojo reg=new servletsPojo(name, Phoneno, email,password);
        try {
        	form.Serveltd(details);
        	doGet(request, response);
        }catch (Exception e) {
			// TODO: handle exception
        	e.printStackTrace();
		}
//        Form1 form1 = new Form1();
//        try {
//			List<servletsPojo> retriveDetails = form1.retriveDetails();
//			RequestDispatcher Dispatcher=request.getRequestDispatcher("NewFile.html");
//	        Dispatcher.forward(request, response);
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        
   	    
	}
//	private synchronized void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException {
//        String  name= request.getParameter("name");
//
//        try (Connection connection = democonnection.getConnection()) {
//            String query = "DELETE FROM employees WHERE name = ?";
//            try (PreparedStatement statement = connection.prepareStatement(query)) {
//                statement.setString(1, name);
//                statement.executeUpdate();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        doGet(request, response);
//    }

//        Connection conn = null;
//
//      try {
//          conn = DriverManager.getConnection(name,phoneno,email);
//
//      
//    	  String sql = "UPDATE demo SET phoneno=6687898988 WHERE name=kayal";
//    	  PreparedStatement stmt = conn.prepareStatement(phoneno);
//        }catch(SQLException)
//        
//        list.add(new servletsPojo(name,Phoneno,email,password));
//        request.setAttribute("list", list);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("NewFile.jsp");
//        dispatcher.forward(request, response);
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Form1 form=new Form1();
		try {
			List<servletsPojo> list = form.retriveDetails();
			request.setAttribute("list", list);
		    request.getRequestDispatcher("NewFile.jsp").forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
