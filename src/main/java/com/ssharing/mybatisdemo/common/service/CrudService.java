package com.ssharing.mybatisdemo.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ssharing.mybatisdemo.common.entity.BaseEntity;
import com.ssharing.mybatisdemo.common.persistence.CrudDao;

@Transactional(readOnly=true)
public abstract class CrudService<DAO extends CrudDao<T>, T extends BaseEntity> extends BaseService {

	@Autowired
	protected DAO dao ;
	
	public T get(String id){
		return dao.get(id);
	}
	
	@Transactional(readOnly=false)
	public int insert(T entity){
		return dao.insert(entity);
	}
	
	@Transactional(readOnly=false)
	public int update(T entity){
		return dao.update(entity);
	}
	
	@Transactional(readOnly=false)
	public int delete(T entity){
		return dao.delete(entity);
	}
	
	public int countAll(){
		return dao.countAll();
	}
	
}
