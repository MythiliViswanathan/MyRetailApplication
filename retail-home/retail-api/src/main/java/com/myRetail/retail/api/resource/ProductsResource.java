package com.myRetail.retail.api.resource;

import com.myRetail.retail.api.response.ProductResponse;

public interface ProductsResource {
	
	public ProductResponse get(Long productId);

}
