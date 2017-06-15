package com.ssharing.mybatisdemo.common.entity;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public abstract class AbstractEntity<ID extends Serializable> implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public abstract ID getId(); 
	
	public abstract void setId(ID id);
	
	public boolean isNew(){
		return null == getId();
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int hashcode = 17;
		hashcode += getId() == null ? 0 : getId().hashCode() * 31;
 		return hashcode;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null) return false;
		if(this == obj) return true;
		if(getClass() != obj.getClass()) return false;
		AbstractEntity<?> that = (AbstractEntity<?>)obj;
		return this.getId() == null ? false : this.getId().equals(that.getId());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ReflectionToStringBuilder.toString(this);
	}
	
}
