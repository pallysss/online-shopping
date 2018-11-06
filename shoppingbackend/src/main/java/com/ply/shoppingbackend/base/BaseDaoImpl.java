package com.ply.shoppingbackend.base;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseDaoImpl<T extends BaseEntity , K extends Serializable> implements BaseDao<T,K> {
	Log log;
	
	private Class<T> persistentClass;
	
	@Autowired
	protected SessionFactory sessionFactory;

	protected Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		this.log = LogFactory.getLog(super.getClass());
		persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Override
	public boolean update(T data ,String userId){
		this.log.debug(new StringBuilder().append("Updating ").append(data).toString());
		data.setModifiedBy(userId);
		data.setModifiedDate(new Date());
		getSession().update(data);
		return true;
	}

	@Override
	public boolean delete(T data){
		this.log.debug(new StringBuilder().append("Deleting ").append(data).toString());
		getSession().delete(data);
		return true;
	}

	@Override
	public boolean insert(T data, String userId) {
		this.log.debug(new StringBuilder().append("Inserting ").append(data).toString());
		data.setCreatedBy(userId);
		data.setCreatedDate(new Date());
		getSession().save(data);
		return true;
	}

	@Override
	public T getById(Serializable K) {		
		return (T) getSession().get(persistentClass, K);
	}

	@Override
	public List<T> listAll() {
		String query = new StringBuilder().append("from ").append(persistentClass.getName()).toString();
		return getSession().createQuery(query).list();
	}
	
	
	
}
