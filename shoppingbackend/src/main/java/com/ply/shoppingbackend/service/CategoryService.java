package com.ply.shoppingbackend.service;

import java.util.List;

import com.ply.shoppingbackend.common.DtoResponse;
import com.ply.shoppingbackend.model.Category;
import com.ply.shoppingbackend.vo.VoCategory;

public interface CategoryService {

	public DtoResponse getActiveCategory();
	
	public Boolean saveCategory(VoCategory vo);
	
	public List<Category> getCategories();
}
