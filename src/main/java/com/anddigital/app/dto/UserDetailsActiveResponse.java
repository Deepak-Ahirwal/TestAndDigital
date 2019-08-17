package com.anddigital.app.dto;

public class UserDetailsActiveResponse {

	private Integer userId;
	private String userName;
	private String activeNumber;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getActiveNumber() {
		return activeNumber;
	}

	public void setActiveNumber(String activeNumber) {
		this.activeNumber = activeNumber;
	}

}
