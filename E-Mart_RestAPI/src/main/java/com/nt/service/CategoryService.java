package com.nt.service;


import java.util.List;

import com.nt.model.CategoryModel;



public interface CategoryService {

	public int addCategory(CategoryModel categoryModel);
	public CategoryModel getCategoryById(long categoryId);
	public List<CategoryModel> getAllCategories();
	public int updateCategory(CategoryModel categoryModel);
	public int deleteCategory(long categoryId);
}
