package com.anddigital.app.dto;

import java.util.List;

public class PhoneDto {

	private String userName;
	private List<String> phoneNumber;
	public PhoneDto(String userName, List<String> phoneNumber) {
		super();
		this.userName = userName;
		this.phoneNumber = phoneNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<String> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
}
