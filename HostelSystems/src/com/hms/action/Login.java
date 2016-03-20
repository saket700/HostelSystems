package com.hms.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import com.hms.dao.Database;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=request.getParameter("username");
		String pass=request.getParameter("password");
		boolean status=false;
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("Email "+email +"  Password : "+pass);
		
		//******Database Connection Test
		/*
		Connection con=Database.getCon();
		if(con!=null)
			out.println("Connected to database successfully");
			
		**********Status Check******************************/
		status=Database.getValidUser(email, pass);
		out.print(status);
		if(status)
		{ 
			HttpSession session=request.getSession();  
	        session.setAttribute("uname",email);
			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			out.print("coming inside");
			System.out.print("inside");
			rd.forward(request,response);
		}
		else
		{
			RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
			rs.include(request,response);
		}
		
	}

}
