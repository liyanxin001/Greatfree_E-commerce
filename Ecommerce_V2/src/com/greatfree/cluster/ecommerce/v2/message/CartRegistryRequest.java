package com.greatfree.cluster.ecommerce.v2.message;

import edu.greatfree.cluster.message.ClusterRequest;

public class CartRegistryRequest extends ClusterRequest{
	
	
	private static final long serialVersionUID = -2213335248527667441L;
	private String username;

	public CartRegistryRequest(String username) {
		super(username, AppID.CART_REGISTRY_REQUEST);
		this.setUsername(username);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
