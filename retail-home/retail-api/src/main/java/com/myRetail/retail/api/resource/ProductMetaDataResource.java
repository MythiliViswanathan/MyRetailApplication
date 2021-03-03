package com.myRetail.retail.api.resource;

import com.myRetail.retail.api.request.ProductMetaDataRequest;
import com.myRetail.retail.api.response.ProductMetaDataResponse;

public interface ProductMetaDataResource {

	public ProductMetaDataResponse get(Long productId)throws Exception ;
	
	public void create(ProductMetaDataRequest request)throws Exception ;
	
	public void update(Long productId,ProductMetaDataRequest request)throws Exception ;
	
}
