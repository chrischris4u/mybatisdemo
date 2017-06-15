package com.ssharing.mybatisdemo.sys.user.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssharing.mybatisdemo.common.service.CrudService;
import com.ssharing.mybatisdemo.sys.user.dao.UserDao;
import com.ssharing.mybatisdemo.sys.user.entity.User;

@Service
@Transactional(readOnly = true)
public class UserService extends CrudService<UserDao, User> {
	
	public User findByName(String name){
		if(StringUtils.isEmpty(name)) return null;
		return dao.findByName(name);
	}
	
	public List<User> findAll(){
		return dao.findAll();
	}
	
}
