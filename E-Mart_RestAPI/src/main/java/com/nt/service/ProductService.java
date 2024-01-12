package com.nt.service;



import java.util.List;

import com.nt.model.ProductModel;
import com.nt.model.ProductModel;



public interface ProductService {
	public int addProduct(ProductModel productModel);
	public ProductModel getProductById(long productId);
	public List<ProductModel> getAllProducts();
	public int updateProduct(ProductModel productrModel);
	public int deleteProduct(long productId);
}
