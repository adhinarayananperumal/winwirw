package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDao;
import com.pojo.EmployeePojo;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/emp")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	EmployeeDao empDao = new EmployeeDao();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action").trim();
		
	
		if (action != null && action.equals("list")) {
			List<EmployeePojo> listEmployee = empDao.listEmployee();
			request.setAttribute("listEmployee", listEmployee);
			System.out.println(" list action ...");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/employeeDashboard.jsp");
			rd.forward(request, response);
		} else if (action != null && action.equals("edit")) {
			int empId = Integer.parseInt(request.getParameter("empId").trim());
			EmployeePojo employeePojo = empDao.getEmployee(empId);
			request.setAttribute("employeePojo", employeePojo);
			System.out.println(" list action ...");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/editEmployee.jsp");
			rd.forward(request, response);
		} else if (action != null && action.equals("delete")) {
			int empId = Integer.parseInt(request.getParameter("empId").trim());
			empDao.deleteEmployee(empId);
			request.setAttribute("updateStatus", "Employee id with " + empId + " deleted Successfully...........");
			System.out.println(" delete action ...");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/editEmployee.jsp");
			rd.forward(request, response); 
		}else {
			System.out.println(" show emp registration form ...");
			RequestDispatcher rd = request.getRequestDispatcher("employeeReg.jsp");
			rd.forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String action = request.getParameter("action").trim();
		
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		int age = Integer.parseInt(request.getParameter("age").trim());
		
		EmployeePojo employeePojo = new EmployeePojo();
		employeePojo.setFirstname(fname);
		employeePojo.setLastname(lname);
		employeePojo.setAge(age);
		
		
		if (action != null && action.equals("edit")) {
			int empId = Integer.parseInt(request.getParameter("empId").trim());
			employeePojo.setEmpId(empId);
			empDao.updateEmployee(employeePojo);
			request.setAttribute("updateStatus", "Employee updated Successfully...........");
			request.setAttribute("empId", employeePojo.getEmpId());

			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/editEmployee.jsp");
			rd.forward(request, response);
		}else {
			empDao.saveEmployee(employeePojo);
			request.setAttribute("saveStatus", "Employee Saved Successfully...........");
			request.setAttribute("empId", employeePojo.getEmpId());

			RequestDispatcher rd = request.getRequestDispatcher("employeeReg.jsp");
			rd.forward(request, response);
		}
	}

}
