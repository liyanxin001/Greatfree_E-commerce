package com.greatfree.cluster.ecommerce.v2.message;

import edu.greatfree.cluster.message.IntercastRequest;

public class AddToCartRequest extends IntercastRequest{
	
	
	
	private static final long serialVersionUID = 5902250438819515287L;

	private String username;
	private String storeName;
	

	public AddToCartRequest(String username, String storeName) {
		super(username, storeName, AppID.ADD_TO_CART_REQUEST);
		this.setUsername(username);
		this.setStoreName(storeName);
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getStoreName() {
		return storeName;
	}


	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}
