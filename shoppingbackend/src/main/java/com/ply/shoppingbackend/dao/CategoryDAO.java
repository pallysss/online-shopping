package com.ply.shoppingbackend.dao;

import java.util.List;

import com.ply.shoppingbackend.dto.Category;

public interface CategoryDAO {
	Boolean add(Category category);
	Boolean update(Category category);
	Boolean delete(Category category);
	public List<Category> list();
	Category getCategory(Integer id);
}
