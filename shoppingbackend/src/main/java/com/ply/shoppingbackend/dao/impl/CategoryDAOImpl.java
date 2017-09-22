package com.ply.shoppingbackend.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ply.shoppingbackend.dao.CategoryDAO;
import com.ply.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<Category>();
	
	static {
		Category category = new Category();
		
		//adding 1st category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is description for Television");
		category.setImageUrl("CAT_1.png");
		category.setActive(Boolean.TRUE);
		
		categories.add(category);
		
		category = new Category();
		
		//adding 2nd category
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is description for Mobile");
		category.setImageUrl("CAT_2.png");
		category.setActive(Boolean.TRUE);
		
		categories.add(category);
		
		category = new Category();
		
		//adding 3rd category
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is description for Laptop");
		category.setImageUrl("CAT_3.png");
		category.setActive(Boolean.TRUE);
		
		categories.add(category);
		
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
