package com.anddigital.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anddigital.app.dto.UserDetailsActiveResponse;
import com.anddigital.app.dto.UserDetailsResponse;
import com.anddigital.app.dto.UserRequest;
import com.anddigital.app.entity.Phone;
import com.anddigital.app.service.PhoneService;

@RestController
public class PhoneController {
	@Autowired
	PhoneService service;

	@GetMapping("/allPhoneNumber")
	public List<Phone> getAllPhoneNumber() {
		return service.getAllPhoneNumber();
	}

	@GetMapping("/allPhoneNumberOfCustomer/{userId}")
	public UserDetailsResponse getAllPhoneNumberOfCustomer(@PathVariable Integer userId) {
		return service.getAllPhoneNumberOfCustomer(userId);
	}

	@PostMapping("/activateUserNumber")
	public UserDetailsActiveResponse activateNumber(@RequestBody UserRequest req) {
		return service.activateNumber(req);
	}
}