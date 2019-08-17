package com.anddigital.app.dto;

import java.util.List;

import com.anddigital.app.entity.Phone;

public class PhoneResponse {

	private List<Phone> phoneNumbers;

	public List<Phone> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<Phone> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	
	
}
