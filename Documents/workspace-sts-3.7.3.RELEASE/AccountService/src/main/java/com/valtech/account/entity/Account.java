package com.valtech.account.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Account {
	
	public static final String SAVING="SB";
	public static final String CURRENT="CA";

	
	@ManyToMany(targetEntity=Customer.class,cascade={CascadeType.MERGE,CascadeType.PERSIST})
	private Set<Customer> customers;
	@JoinTable(name="Customer_Account",joinColumns=@JoinColumn(name="Customer_id",referencedColumnName="id"),
	inverseJoinColumns=@JoinColumn(name="Account_id",referencedColumnName="id"))
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String accountType;
	private double balance;
	private LocalDateTime creationDate;
	private LocalDateTime lastupdateDate;
	private boolean action;
	
	public Account() {
	}
	
	
	
	public Account(long id, String accountType, double balance, LocalDateTime creationDate, LocalDateTime lastupdateDate,
			boolean action) {
		super();
		this.id = id;
		this.accountType = accountType;
		this.balance = balance;
		this.creationDate = creationDate;
		this.lastupdateDate = lastupdateDate;
		this.action = action;
	}

	
	public Account(String accountType, double balance) {
		super();
		this.accountType = accountType;
		this.balance = balance;
		this.creationDate = LocalDateTime.now();
		this.lastupdateDate = LocalDateTime.now();
		this.action = false;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public LocalDateTime getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
	public LocalDateTime getLastupdateDate() {
		return lastupdateDate;
	}
	public void setLastupdateDate(LocalDateTime lastupdateDate) {
		this.lastupdateDate = lastupdateDate;
	}
	public boolean isAction() {
		return action;
	}
	public void setAction(boolean action) {
		this.action = action;
	}



	public Set<Customer> getCustomers() {
		return customers;
	}



	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}



	public static String getSaving() {
		return SAVING;
	}



	public static String getCurrent() {
		return CURRENT;
	}
	
	
}
