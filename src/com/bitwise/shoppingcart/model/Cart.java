package com.bitwise.shoppingcart.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	List<String> list=new ArrayList<String>();;
	
	
	public void addToCart(String name){
		System.out.println("In cart.java "+name);
		list.add(name);
	}
	
	public void removeFromCart(String name) {
		list.remove(name);
	}
	public List<String> displayItem() {
		return list;
	}
}
