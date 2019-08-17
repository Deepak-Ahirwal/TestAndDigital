package com.anddigital.app.dto;

import java.util.List;

import com.anddigital.app.entity.Phone;

public class UserDetailsResponse {
	
	private Integer userId;
	private String userName;
	private List<Phone> phoneLlise;
	public long getId() {
		return userId;
	}
	public void setId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<Phone> getPhoneLlise() {
		return phoneLlise;
	}
	public void setPhoneLlise(List<Phone> phoneLlise) {
		this.phoneLlise = phoneLlise;
	}
	

}
