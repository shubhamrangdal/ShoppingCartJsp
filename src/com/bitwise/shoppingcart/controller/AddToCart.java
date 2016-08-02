package com.bitwise.shoppingcart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bitwise.shoppingcart.model.Cart;

/**
 * Servlet implementation class DisplayItemServlet
 */
//@WebServlet("/AddToCart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddToCart() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Cart cartitems=new Cart();
		List< String> list=new ArrayList<>();
		String addButton=request.getParameter("add");
		String[] item=request.getParameterValues("items");
		System.out.println(addButton+""+item);
		if(addButton.equals("add"))
		{
			for(int i=0;i<item.length;i++){
				list.add(item[i]);
				out.println("<br><br>"+list.get(i));
			}
			request.getRequestDispatcher("Cart.jsp").include(request, response);
		}
		if(addButton.equals("Delete"))
		{
			for(int i=0;i<item.length;i++){
				list.add(item[i]);
			
				out.println("<br><br>"+list.get(i));
			}
			request.getRequestDispatcher("Cart.jsp").include(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
