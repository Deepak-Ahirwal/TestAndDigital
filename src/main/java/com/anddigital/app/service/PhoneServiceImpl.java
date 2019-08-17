package com.anddigital.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anddigital.app.dao.PhoneRepository;
import com.anddigital.app.dao.UserRepository;
import com.anddigital.app.dto.UserDetailsActiveResponse;
import com.anddigital.app.dto.UserDetailsResponse;
import com.anddigital.app.dto.UserRequest;
import com.anddigital.app.entity.Phone;
import com.anddigital.app.entity.UserDetails;

@Service
public class PhoneServiceImpl implements PhoneService {
	@Autowired
	PhoneRepository repo;
	
	@Autowired
	UserRepository userRepo;

	@Override
	public List<Phone> getAllPhoneNumber() {
		List<Phone> phoneList = new ArrayList<>();
		phoneList = repo.findAll();
		return phoneList;
	}

	@Override
	public UserDetailsResponse getAllPhoneNumberOfCustomer(Integer userId) {
		UserDetailsResponse response = new UserDetailsResponse();
		Optional<UserDetails> userEntity = userRepo.findById(userId);
		response.setId(userEntity.get().getUserId());
		response.setUserName(userEntity.get().getUserName());
		response.setPhoneLlise(userEntity.get().getPhoneNumbers());
		return response;
		 
	}

	@Override
	public UserDetailsActiveResponse activateNumber(UserRequest req) {
		UserDetailsActiveResponse res = new UserDetailsActiveResponse();
		Optional<UserDetails> checkUsersPhoneNum = Optional.ofNullable(userRepo.findByPhoneNumber(req.getUserName()));
		for(Phone ph : checkUsersPhoneNum.get().getPhoneNumbers()) {
			if (ph.getPhoneNumber().equals(req.getPhoneNumber())){
				Phone phn = new Phone();
				repo.updateNumberStatus(req.getPhoneNumber());
			}
			res.setUserName(req.getUserName());
			res.setUserId(checkUsersPhoneNum.get().getUserId());
			res.setActiveNumber(ph.getPhoneNumber());
			res.setMessage(res.getActiveNumber() +" : Phone number actevated successfull");
		}
		return res;
	}

}
