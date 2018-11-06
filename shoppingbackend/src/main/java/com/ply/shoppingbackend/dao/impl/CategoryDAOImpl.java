package com.ply.shoppingbackend.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ply.shoppingbackend.base.BaseDaoImpl;
import com.ply.shoppingbackend.dao.CategoryDAO;
import com.ply.shoppingbackend.model.Category;

@Repository("categoryDAOImpl")
public class CategoryDAOImpl extends BaseDaoImpl<Category, String> implements CategoryDAO {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Category> listCategory() {
		// fethced from entity name / not a table name
		String selectActiveCategory = "from Category";
		Query query = getSession().createQuery(selectActiveCategory);
		//query.setParameter("active", Boolean.TRUE);
		return query.list();
	}
	
	@Override
	public List<Category> getActiveCategories(){
		CriteriaBuilder cb = getSession().getCriteriaBuilder();
		CriteriaQuery<Category> cq = cb.createQuery(Category.class);
		Root<Category> root = cq.from(Category.class);
		cq.select(root).where(cb.equal(root.get("active"), Boolean.TRUE));
		Query<Category> query = getSession().createQuery(cq);
		return query.getResultList();
	}


}
