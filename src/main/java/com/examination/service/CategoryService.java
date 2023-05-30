package com.examination.service;

import java.util.Set;

import com.examination.entity.exam.Category;

public interface CategoryService {

	public Category addCategory(Category category);

	public Category updateCategory(Category category);

	public Set<Category> getCategories();

	public Category getCategory(Long categoryId);
	
	public void deleteCategory (Long categoryId);
}
