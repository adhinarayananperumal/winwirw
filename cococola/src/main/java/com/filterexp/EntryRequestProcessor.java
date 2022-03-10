package com.filterexp;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class EntryRequestProcessor
 */
@WebFilter("/*")
public class EntryRequestProcessor extends HttpFilter implements Filter {

	/**
	 * @see HttpFilter#HttpFilter()
	 */
	public EntryRequestProcessor() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("before");

		HttpServletRequest req = ((HttpServletRequest) request);
		HttpSession s = req.getSession(false);
		
		String p = req.getRequestURL().toString();
		
		System.out.println(p);

		if (p.endsWith("authServlet") || p.endsWith("LoginServlet") || p.endsWith("login.jsp") || s != null) {
			// pass the request along the filter chain
			chain.doFilter(request, response);
		} else {
			HttpServletResponse res = ((HttpServletResponse) response);
			res.sendRedirect("authServlet");
		}

		System.out.println("after");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
