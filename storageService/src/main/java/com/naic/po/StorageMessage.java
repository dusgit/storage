package com.naic.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class StorageMessage implements Serializable{

	private static final long serialVersionUID = -7630631308503503577L;
	
	private Integer id;
	private String phone; //手机号
	private String message; //短信内容
	private Timestamp createTime; 
	private Timestamp updateTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	
	
}
