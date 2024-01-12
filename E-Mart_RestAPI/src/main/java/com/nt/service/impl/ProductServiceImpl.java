package com.nt.service.impl;



import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.ProductDao;
import com.nt.entity.ProductEntity;
import com.nt.exception.ResourceNotExist;
import com.nt.model.ProductModel;
import com.nt.service.ProductService;



@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private ProductDao productDao;

	@Override
	public int addProduct(ProductModel productModel) {
		return productDao.addProduct(mapper.map(productModel, ProductEntity.class));
	}

	@Override
	public ProductModel getProductById(long productId) {
ProductEntity productEntity = productDao.getProductById(productId);
		
		System.out.println("in service");
		ProductModel productModel =null;
		
		if(productEntity!=null) {
			 productModel=mapper.map(productEntity, ProductModel.class);
		}
			return productModel;
	}

	@Override
	public List<ProductModel> getAllProducts() {
		List<ProductEntity> allProduct = productDao.getAllProducts();
		List<ProductModel> list=null;
		if(!allProduct.isEmpty()) {
			
		 list = allProduct.stream().map(entity -> mapper.map(entity, ProductModel.class)).collect(Collectors.toList());
			
		}else {
			throw new ResourceNotExist("Product Not Exists");
		}
		return list;
	}

	@Override
	public int updateProduct(ProductModel productrModel) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteProduct(long productId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
