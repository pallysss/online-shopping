package com.ply.shoppingbackend.base;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T extends BaseEntity , K extends Serializable> {
	
	public boolean insert(T paramT, String userId) ;

	public boolean update(T paramT, String userId) ;

	public boolean delete(T paramT) ;

	public T getById(Serializable paramSerializable) ;

	public List<T> listAll() ;

}
