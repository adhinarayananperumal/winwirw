package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<String> productDet = new ArrayList();

		String item = request.getParameter("item");
		
		if(item.equals("laptop")){
			productDet.add("HP");
			productDet.add("Dell");
			productDet.add("IBM");
			request.setAttribute("productDet", productDet);
			
		}else if(item.equals("mobile")) {
			productDet.add("Samsung");
			productDet.add("Apple");
			productDet.add("Panosonic");
			request.setAttribute("productDet", productDet);
			
		}else {
			productDet.add("nooption");
			request.setAttribute("productDet", productDet);
		}
			
		
	
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/products.jsp");
		rd.forward(request, response);
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
