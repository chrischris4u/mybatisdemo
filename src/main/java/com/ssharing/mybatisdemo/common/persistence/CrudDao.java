package com.ssharing.mybatisdemo.common.persistence;

public interface CrudDao<T> extends BaseDao {

	public T get(String id);
	
	public int insert(T entity);
	
	public int update(T entity);
	
	public int delete(T entity);
	
	public int countAll();
	
}
