package com.nt.dao;



import java.util.List;

import com.nt.entity.ProductEntity;
import com.nt.entity.ProductEntity;



public interface ProductDao {
	public int addProduct(ProductEntity productEntity);
	public ProductEntity getProductById(long productId);
	public List<ProductEntity> getAllProducts();
	public int updateProduct(ProductEntity productEntity);
	public int deleteProduct(long productId);
}
