package com.csys.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.csys.model.ServletPojo;



/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private List<ServletPojo> formlist = new ArrayList<>();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.getWriter().append("Served at: ").append(request.getContextPath());
		    request.setAttribute("formlist", formlist);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
	        dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("Name");
		pw.println(name);
		String email = request.getParameter("id");
		int phoneno = Integer.parseInt(request.getParameter("phone"));
		String gender = request.getParameter("Gender");
		String address = request.getParameter("address");
		String date = request.getParameter("dataofbith");
		String  district= request.getParameter("district");


		pw.println(district);

		pw.println(name);
		pw.println(email);
		pw.println(phoneno);
		pw.println(gender);
		pw.println(address);
		pw.println(date);

//		ServletPojo serveltss = new ServletPojo();
		//formlist.add(serveltss);

		doGet(request, response);
	}

	

}
