package com.ply.shoppingbackend.dao;

import java.util.List;

import com.ply.shoppingbackend.base.BaseDao;
import com.ply.shoppingbackend.model.Category;

public interface CategoryDAO extends BaseDao<Category, String>{
	public List<Category> listCategory();
	
	public List<Category> getActiveCategories();
}
