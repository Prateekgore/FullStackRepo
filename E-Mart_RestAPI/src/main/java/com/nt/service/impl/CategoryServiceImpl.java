package com.nt.service.impl;



import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.CategoryDao;
import com.nt.entity.CategoryEntity;
import com.nt.exception.ResourceNotExist;
import com.nt.model.CategoryModel;
import com.nt.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private CategoryDao categoryDao;

	@Override
	public int addCategory(CategoryModel categoryModel) {
		return categoryDao.addCategory(mapper.map(categoryModel, CategoryEntity.class));

	}

	@Override
	public CategoryModel getCategoryById(long categoryId) {
		CategoryEntity categoryEntity = categoryDao.getCategoryById(categoryId);
		
		System.out.println("in service");
		CategoryModel categoryModel =null;
		
		if(categoryEntity!=null) {
			 categoryModel=mapper.map(categoryEntity, CategoryModel.class);
		}
			return categoryModel;
		}

	@Override
	public List<CategoryModel> getAllCategories() {
		List<CategoryEntity> allCategory = categoryDao.getAllCategories();
		List<CategoryModel> list=null;
		if(!allCategory.isEmpty()) {
			
		 list = allCategory.stream().map(entity -> mapper.map(entity, CategoryModel.class)).collect(Collectors.toList());
			
		}else {
			throw new ResourceNotExist("Category Not Exists");
		}
		return list;
	}

	@Override
	public int updateCategory(CategoryModel categoryModel) {
		
		return 0;
	}

	@Override
	public int deleteCategory(long categoryId) {
		
		return 0;
	}

}
