package com.training.dao;
import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.model.servletsPojo;

/**
 * Servlet implementation class Serveltd
 */
@WebServlet("/Serveltd")
public class Serveltd extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	private List<servletsPojo>list=new ArrayList<>();
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		Form1 form=new Form1();
		PrintWriter pw=response.getWriter();
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
        	PrintWriter writer = response.getWriter();
        	writer.println(details.getName());
        }catch (Exception e) {
			// TODO: handle exception
        	e.printStackTrace();
		}
        
        	
        }
        
//        list.add(new servletsPojo(name,Phoneno,email,password));
//        request.setAttribute("list", list);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("NewFile.jsp");
//        dispatcher.forward(request, response);
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
