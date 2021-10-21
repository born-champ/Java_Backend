package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Login;
import com.service.LoginService;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		Login ll=new Login();
		ll.setEmail(email);
		ll.setPassword(password);
		LoginService ls=new LoginService();
		String result=ls.signIn(ll);
		RequestDispatcher rd1=request.getRequestDispatcher("index.jsp");
		RequestDispatcher rd2=request.getRequestDispatcher("userHome.jsp");
		RequestDispatcher rd3=request.getRequestDispatcher("adminHome.jsp");
		if (result.equals("failure")) {
			pw.write(result);
			rd1.include(request, response);			
		} else if (result.equals("admin")){
			rd3.forward(request, response);
		}else {
			rd2.forward(request, response);
		} 		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		PrintWriter pw=response.getWriter();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		Login ll=new Login();
		ll.setEmail(email);
		ll.setPassword(password);
		LoginService ls=new LoginService();
		String result=ls.signUp(ll);
		pw.write(result);
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.include(request, response);
		
		
	}

}
