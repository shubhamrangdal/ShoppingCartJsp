package com.bitwise.shoppingcart.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class LoginFilter
 */
//@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

   
    public LoginFilter() {
      
    }

	
	public void destroy() {
		
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		if(request.getParameter("username").equals("Shubham")&& request.getParameter("password").equals("12345"))
			chain.doFilter(request, response);
		else
		{
			out.print("<br color=\"red\"> Invalid Username and Password<br><br><br>");
			request.getRequestDispatcher("Login.jsp").include(request, response);
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
