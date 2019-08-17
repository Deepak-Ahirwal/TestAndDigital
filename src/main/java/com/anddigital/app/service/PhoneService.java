package com.anddigital.app.service;

import java.util.List;

import com.anddigital.app.dto.UserDetailsActiveResponse;
import com.anddigital.app.dto.UserDetailsResponse;
import com.anddigital.app.dto.UserRequest;
import com.anddigital.app.entity.Phone;

public interface PhoneService {

	List<Phone> getAllPhoneNumber();

	UserDetailsResponse getAllPhoneNumberOfCustomer(Integer userId);

	UserDetailsActiveResponse activateNumber(UserRequest req);

}
