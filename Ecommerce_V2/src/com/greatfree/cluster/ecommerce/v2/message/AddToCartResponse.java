package com.greatfree.cluster.ecommerce.v2.message;

import com.greatfree.cluster.ecommerce.v2.data.Product;

import edu.greatfree.multicast.message.MulticastResponse;

public class AddToCartResponse extends MulticastResponse{
	
	private static final long serialVersionUID = 6468081410236404230L;
	private Product product;

	public AddToCartResponse(Product product, String collaboratorKey) {
		super(AppID.ADD_TO_CART_RESPONSE, collaboratorKey);
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}


	

}
