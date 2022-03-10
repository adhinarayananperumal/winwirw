package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CustomerCart
 */
@WebServlet("/customerCart")
public class CustomerCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	


	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CustomerCart() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/checkout.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<String> csp = new ArrayList();


		Enumeration<String> p = request.getParameterNames();
		HttpSession session = request.getSession(false);
		if (session != null) {

			while (p.hasMoreElements()) {
				csp.add(p.nextElement());
			}
			
			((List)session.getAttribute("csp")).addAll(csp);
			System.out.println("Ex" + ((List)session.getAttribute("csp")).toString());



			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/productList.jsp");
			rd.forward(request, response);
		}

	}

}
