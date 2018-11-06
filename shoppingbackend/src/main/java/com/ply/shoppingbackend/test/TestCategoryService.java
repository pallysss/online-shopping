package com.ply.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ply.shoppingbackend.config.HibernateConfig;
import com.ply.shoppingbackend.service.CategoryService;
import com.ply.shoppingbackend.vo.VoCategory;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {HibernateConfig.class})
public class TestCategoryService {
	
	@Autowired
	private CategoryService categoryService;
	
	@Test
	public void insertCategory() {
		VoCategory vo = new VoCategory();
		vo.setId("CAT_001");
		vo.setName("Television");
		vo.setDescription("This is description for Television");
		vo.setImageUrl("CAT_1.png");
		vo.setActive(Boolean.TRUE);
		categoryService.saveCategory(vo);
		
		VoCategory vo2 = new VoCategory();
		vo2.setId("CAT_002");
		vo2.setName("Laptop");
		vo2.setDescription("This is description for Laptop");
		vo2.setImageUrl("CAT_2.png");
		vo2.setActive(Boolean.TRUE);
		categoryService.saveCategory(vo2);
	}

}
