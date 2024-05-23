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
 * Servlet implementation class Readservlet
 */
@WebServlet("/Readservlet")
public class Readservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public List<servletsPojo>list=new ArrayList<>();
	servletsPojo details=new servletsPojo();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Readservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Form1 form=new Form1();
		PrintWriter pw=response.getWriter();
        String name = request.getParameter("name");
        String phoneno = request.getParameter("phoneno");
        String email=request.getParameter("email");
        String password=request.getParameter("password");
		try {
			list=form.retriveDetails();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//      System.out.println(list);
      System.out.println("Displayed successfully..");
        request.setAttribute("list", list);
         RequestDispatcher requestDispatcher=request.getRequestDispatcher("NewFile.jsp");
         requestDispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
