package com.valtech.tx.entity;

import java.time.LocalDateTime;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("atx")

public class AtmNo extends Tx {
	
	private int atmNo;
	private String location;
	
	
	
	public AtmNo() {
		super();
		
	}
	public AtmNo(float amount, boolean debit, LocalDateTime txTime, long accountId) {
		super(amount, debit, txTime, accountId);
		
	}
	public AtmNo(long id, float amount, boolean debit, LocalDateTime txTime, long accountId) {
		super(id, amount, debit, txTime, accountId);
		
	}
	public AtmNo(int atmNo, String location) {
		super();
		this.atmNo = atmNo;
		this.location = location;
	}
	public int getAtmNo() {
		return atmNo;
	}
	public void setAtmNo(int atmNo) {
		this.atmNo = atmNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
