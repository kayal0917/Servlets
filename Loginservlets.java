package com.chainsys.studentdao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loginservlets
 */
@WebServlet(name = "LoginServlets", urlPatterns = { "/Servlet1" })
public class Loginservlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginservlets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("link.html").include(request, response);
        
        String username= request.getParameter("username");
        String password=request.getParameter("password");
        
        if(password.equals("admin")) {
            out.print("Login Successfull");
            Cookie ck = new Cookie("name",username);
            response.addCookie(ck);
            
        }else {
            out.print("Sorry Invalid User or Password");
            request.getRequestDispatcher("login.html").include(request, response);

        }
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
