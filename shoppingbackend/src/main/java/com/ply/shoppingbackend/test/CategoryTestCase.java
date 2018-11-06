package com.ply.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ply.shoppingbackend.dao.CategoryDAO;
import com.ply.shoppingbackend.model.Category;
import com.ply.shoppingbackend.service.CategoryService;
import com.ply.shoppingbackend.vo.VoCategory;

public class CategoryTestCase {
	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private static CategoryService categoryService;
	
	private Category category;
	
	@BeforeClass
	public static void init(){
		context = new AnnotationConfigApplicationContext();
		context.scan("com.ply.shoppingbackend");
		context.refresh();
		
		//categoryDAO = (CategoryDAO) context.getBean("categoryDAOImpl");
		categoryService = (CategoryService) context.getBean("categoryServiceImpl");
	}
	
//	@Test
//	public void testAddCategory(){
//		category = new Category();
//		category.setName("Laptop");
//		category.setDescription("This is description for Laptop");
//		category.setImageUrl("CAT_2.png");
//		category.setActive(Boolean.TRUE);
//		
//		assertEquals("Successfully added a category inside the table", Boolean.TRUE,categoryDAO.add(category));
//	}
	
//	@Test
//	public void testGetCategory() {
//		category = categoryDAO.getCategory(1);
//		assertEquals("Successfully get a Televesion category inside the table","Television",category.getName());
//	}
	
//	@Test
//	public void testGetCategory() {
//		category = categoryDAO.getCategory(1);
//		category.setName("TV");
//		assertEquals("Successfully Change category inside the table",Boolean.TRUE, categoryDAO.update(category));
//	}
	
//	@Test
//	public void testGetCategory() {
//		category = categoryDAO.getCategory(1);
//		assertEquals("Successfully deleted a Televesion category inside the table",Boolean.TRUE,categoryDAO.delete(category));;
//	}
	
//	@Test
//	public void testListCategory() {
//		assertEquals("Successfully fetched a List category inside the table",1,categoryDAO.list().size());
//	}
	
//	@Test
//	public void testCRUDCategory() {
//		category = new Category();
//		category.setId("CAT_001");
//		category.setName("Television");
//		category.setDescription("This is description for Television");
//		category.setImageUrl("CAT_1.png");
//		category.setActive(Boolean.TRUE);
//		assertEquals("Successfully added a category inside the table", true ,categoryDAO.insert(category, "PLY12"));
//		
//		category = new Category();
//		category.setId("CAT_002");
//		category.setName("Laptop");
//		category.setDescription("This is description for Laptop");
//		category.setImageUrl("CAT_2.png");
//		category.setActive(Boolean.TRUE);
//		assertEquals("Successfully added a category inside the table", true,categoryDAO.insert(category, "PLY12"));
//		
//		//category = categoryDAO.getById("CAT_001");
//		//category.setName("TV");
//		//assertEquals("Successfully Change category inside the table",Boolean.TRUE, categoryDAO.update(category));
//		
//		//assertEquals("Successfully Change category inside the table",Boolean.TRUE, categoryDAO.delete(category));
//	
//		//assertEquals("Successfully fetched a List category inside the table",1,categoryDAO.list().size());
//		
//	}
	
	@Test
	public void testCRUDCategory() {
		VoCategory vo = new VoCategory();
		vo.setId("CAT_001");
		vo.setName("Television");
		vo.setDescription("This is description for Television");
		vo.setImageUrl("CAT_1.png");
		vo.setActive(Boolean.TRUE);
		assertEquals("Successfully added a category inside the table", true,categoryService.saveCategory(vo));
		
		
		VoCategory vo2 = new VoCategory();
		vo2.setId("CAT_002");
		vo2.setName("Laptop");
		vo2.setDescription("This is description for Laptop");
		vo2.setImageUrl("CAT_2.png");
		vo2.setActive(Boolean.TRUE);
		assertEquals("Successfully added a category inside the table", true,categoryService.saveCategory(vo2));
		
		VoCategory vo3 = new VoCategory();
		vo3.setId("CAT_003");
		vo3.setName("Mobile");
		vo3.setDescription("This is description for Mobile");
		vo3.setImageUrl("CAT_3.png");
		vo3.setActive(Boolean.TRUE);
		assertEquals("Successfully added a category inside the table", true,categoryService.saveCategory(vo3));
		
		VoCategory vo4 = new VoCategory();
		vo4.setId("CAT_004");
		vo4.setName("PC");
		vo4.setDescription("This is description for Personal Computer");
		vo4.setImageUrl("CAT_4.png");
		vo4.setActive(Boolean.FALSE);
		assertEquals("Successfully added a category inside the table", true,categoryService.saveCategory(vo4));
	}
	
	

}
