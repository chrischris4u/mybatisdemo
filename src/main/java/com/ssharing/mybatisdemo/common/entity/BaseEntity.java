package com.ssharing.mybatisdemo.common.entity;

public class BaseEntity extends AbstractEntity<Long> {

	private Long id ;
	
	public BaseEntity() {
		
	}
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

}
