package com.greatfree.cluster.ecommerce.v2.message;

import com.greatfree.cluster.ecommerce.v2.data.Product;

import edu.greatfree.cluster.message.ClusterRequest;

public class AddToStoreRequest extends ClusterRequest{
	
	
	private static final long serialVersionUID = -5033599383268214849L;
	private Product product;
	private String storeName;
	
	public AddToStoreRequest(Product product, String storeName) {
		super(storeName, AppID.ADD_TO_STORE_REQUEST);
		this.setProduct(product);
		this.setStoreName(storeName);
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	
    
}
