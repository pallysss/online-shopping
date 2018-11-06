package com.ply.shoppingbackend.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ply.shoppingbackend.common.DtoResponse;
import com.ply.shoppingbackend.constants.Constant;
import com.ply.shoppingbackend.dao.CategoryDAO;
import com.ply.shoppingbackend.model.Category;
import com.ply.shoppingbackend.service.CategoryService;
import com.ply.shoppingbackend.vo.VoCategory;

@Service
@Transactional()
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@Override
	public DtoResponse getActiveCategory() {
		List<Category> list = categoryDAO.listCategory();
		return DtoResponse.construct(Constant.SUCCESS, null, list);
	}
	
	@Override
	public Boolean saveCategory(VoCategory vo) {
		Category category = new Category();
		BeanUtils.copyProperties(vo, category);
		return categoryDAO.insert(category, "PLY12");
	}
	
	@Override
	public List<Category> getCategories() {
		return categoryDAO.getActiveCategories();
	}
	

}
