package com.ssharing.mybatisdemo.sys.user.dao;

import java.util.List;

import com.ssharing.mybatisdemo.common.persistence.CrudDao;
import com.ssharing.mybatisdemo.common.persistence.annotation.MyDao;
import com.ssharing.mybatisdemo.sys.user.entity.User;

@MyDao
public interface UserDao extends CrudDao<User> {
	
	public User findByName(String name);
	
	public List<User> findAll();
	
}
