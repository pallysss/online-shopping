package com.ply.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ply.shoppingbackend.dao.CategoryDAO;
import com.ply.shoppingbackend.dto.Category;

public class CategoryTestCase {
	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	@BeforeClass
	public static void init(){
		context = new AnnotationConfigApplicationContext();
		context.scan("com.ply.shoppingbackend");
		context.refresh();
		
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
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
	
	@Test
	public void testCRUDCategory() {
		category = new Category();
		
		category.setName("Television");
		category.setDescription("This is description for Television");
		category.setImageUrl("CAT_1.png");
		category.setActive(Boolean.TRUE);
		assertEquals("Successfully added a category inside the table", Boolean.TRUE,categoryDAO.add(category));
		
		category = new Category();
		category.setName("Laptop");
		category.setDescription("This is description for Laptop");
		category.setImageUrl("CAT_2.png");
		category.setActive(Boolean.TRUE);
		assertEquals("Successfully added a category inside the table", Boolean.TRUE,categoryDAO.add(category));
		
		category = categoryDAO.getCategory(1);
		category.setName("TV");
		assertEquals("Successfully Change category inside the table",Boolean.TRUE, categoryDAO.update(category));
		
		assertEquals("Successfully Change category inside the table",Boolean.TRUE, categoryDAO.delete(category));
	
		assertEquals("Successfully fetched a List category inside the table",1,categoryDAO.list().size());
		
	}
	
	

}
