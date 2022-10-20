package com.valtech.account.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;
@Entity
public class Customer {
	
	@ManyToMany(targetEntity=Account.class,cascade={CascadeType.MERGE,CascadeType.PERSIST})
	private Set<Account> accounts;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String mail;
	private String mobile;
	private LocalDate birthDate;
	private String address;
	private String customerType;
	private int pincode;
	
	public Customer() {
		
	}
	
	public Customer(int id, String name, String mail, String mobile, LocalDate birthDate, String address,
			String customerType, int pincode) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.mobile = mobile;
		this.birthDate = birthDate;
		this.address = address;
		this.customerType = customerType;
		this.pincode = pincode;
	}

	public Customer(String name, String mail, String mobile, LocalDate birthDate, String address,
			String customerType, int pincode) {
		super();
		this.name = name;
		this.mail = mail;
		this.mobile = mobile;
		this.birthDate = birthDate;
		this.address = address;
		this.customerType = customerType;
		this.pincode = pincode;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Set<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}
	
	
	

}
