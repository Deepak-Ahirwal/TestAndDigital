package com.anddigital.app.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.anddigital.app.entity.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {

	@Transactional
	@Modifying
	@Query("update Phone p set p.active =true where p.phoneNumber = :phoneNumber")
	void updateNumberStatus(@Param("phoneNumber") String phoneNumber);

}
