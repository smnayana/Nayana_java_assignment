package com.valtech.tx.entity;

import java.time.LocalDateTime;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("txx")

public class TransferTx  extends Tx{
	
	private int formAccount;
	private int toAccount;
	
	
	
	public TransferTx(int formAccount, int toAccount) {
		super();
		this.formAccount = formAccount;
		this.toAccount = toAccount;
	}
	public TransferTx() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransferTx(float amount, boolean debit, LocalDateTime txTime, long accountId) {
		super(amount, debit, txTime, accountId);
		// TODO Auto-generated constructor stub
	}
	public TransferTx(long id, float amount, boolean debit, LocalDateTime txTime, long accountId) {
		super(id, amount, debit, txTime, accountId);
		// TODO Auto-generated constructor stub
	}
	public int getFormAccount() {
		return formAccount;
	}
	public void setFormAccount(int formAccount) {
		this.formAccount = formAccount;
	}
	public int getToAccount() {
		return toAccount;
	}
	public void setToAccount(int toAccount) {
		this.toAccount = toAccount;
	}
	
	

}
