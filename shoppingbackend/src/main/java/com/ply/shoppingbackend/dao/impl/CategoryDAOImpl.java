package com.ply.shoppingbackend.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ply.shoppingbackend.dao.CategoryDAO;
import com.ply.shoppingbackend.dto.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Category> list() {
		// fethced from entity name / not a table name
		String selectActiveCategory = "From Category WHERE active = :active";
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		query.setParameter("active", Boolean.TRUE);
		return query.getResultList();
	}

	@Override
	public Category getCategory(Integer id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Category.class, id);
	}

	@Override
	public Boolean add(Category category) {
		try {
			sessionFactory.getCurrentSession().persist(category);
			return Boolean.TRUE;
		} catch (Exception e) {
			e.printStackTrace();
			return Boolean.FALSE;
		}
		// TODO Auto-generated method stub
	}

	@Override
	public Boolean update(Category category) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(category);
			return Boolean.TRUE;
		} catch (Exception e) {
			e.printStackTrace();
			return Boolean.FALSE;
		}
	}

	@Override
	public Boolean delete(Category category) {
		// TODO Auto-generated method stub
		category.setActive(Boolean.FALSE);
		try {
			sessionFactory.getCurrentSession().update(category);
			return Boolean.TRUE;
		} catch (Exception e) {
			e.printStackTrace();
			return Boolean.FALSE;
		}
	}

}
