package com.valtech.tx.entity;

import java.time.LocalDateTime;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ctx")

public class ChequeTx extends Tx {
	
	private int chequeNo;
	private boolean outStation;
	private float collectionCharges;
	
	
	
	public ChequeTx() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChequeTx(float amount, boolean debit, LocalDateTime txTime, long accountId) {
		super(amount, debit, txTime, accountId);
		// TODO Auto-generated constructor stub
	}
	public ChequeTx(long id, float amount, boolean debit, LocalDateTime txTime, long accountId) {
		super(id, amount, debit, txTime, accountId);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public ChequeTx(int chequeNo, boolean outStation, float collectionCharges) {
		super();
		this.chequeNo = chequeNo;
		this.outStation = outStation;
		this.collectionCharges = collectionCharges;
	}
	public int getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(int chequeNo) {
		this.chequeNo = chequeNo;
	}
	public boolean isOutStation() {
		return outStation;
	}
	public void setOutStation(boolean outStation) {
		this.outStation = outStation;
	}
	public float getCollectionCharges() {
		return collectionCharges;
	}
	public void setCollectionCharges(float collectionCharges) {
		this.collectionCharges = collectionCharges;
	}
	
	

}
