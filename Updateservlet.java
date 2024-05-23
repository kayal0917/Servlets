package com.training.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.model.servletsPojo;

/**
 * Servlet implementation class Updateservlet
 */
@WebServlet("/Updateservlet")
public class Updateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<servletsPojo>list=new ArrayList<>();
	servletsPojo details=new servletsPojo();
	Form1 form=new Form1();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Updateservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
        String email=request.getParameter("email");
            try 
            {  
            	form.UpdateEmployee(name, email);
                
                PrintWriter writer = response.getWriter();
                writer.println(name + "updated");
            } 
            catch (ClassNotFoundException | SQLException e) 
            {
                e.printStackTrace();
            }

//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		PrintWriter pw=response.getWriter();
//        String name = request.getParameter("name");
//        details.setName(name);
//
//        String phoneno = request.getParameter("phoneno");
//        details.setPhoneno(phoneno);
//        String email=request.getParameter("email");
//        details.setEmail(email);
//
//        String password=request.getParameter("password");
//        details.setPassword(password);
//
////        String parameter = request.getParameter("submit");
////        System.out.println(parameter);
////        servletsPojo reg=new servletsPojo(name, Phoneno, email,password);
//        try {
//        	form.Serveltd(details);
//        	PrintWriter writer = response.getWriter();
//        	writer.println(details.getName());
//        }catch (Exception e) {
//			// TODO: handle exception
//        	e.printStackTrace();
//		}
//        Form1 form1 = new Form1();
//        try {
////        	form1.update();
//			RequestDispatcher Dispatcher=request.getRequestDispatcher("NewFile.html");
//	        Dispatcher.forward(request, response);
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//   	    

	}


}
