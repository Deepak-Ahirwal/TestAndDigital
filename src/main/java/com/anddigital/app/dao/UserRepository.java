package com.anddigital.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.anddigital.app.entity.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, Integer> {

	@Query("SELECT u FROM UserDetails u WHERE u.userName = :userName")
	UserDetails findByPhoneNumber(@Param("userName") String userName);

}
