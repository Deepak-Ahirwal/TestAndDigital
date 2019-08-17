package com.anddigital.app.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1276828917464992543L;
	private Integer userId;
	private String userName;
	private List<Phone> phoneObj;

	public UserDetails(Integer userId, String userName, List<Phone> phoneObj) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.phoneObj = phoneObj;
	}

	public UserDetails() {
		super();

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID", unique = true, nullable = false)
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "USER_NAME")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@OneToMany(cascade = CascadeType.PERSIST, orphanRemoval = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")
	public List<Phone> getPhoneNumbers() {
		return phoneObj;
	}

	public void setPhoneNumbers(List<Phone> phoneObj) {
		this.phoneObj = phoneObj;
	}

}
