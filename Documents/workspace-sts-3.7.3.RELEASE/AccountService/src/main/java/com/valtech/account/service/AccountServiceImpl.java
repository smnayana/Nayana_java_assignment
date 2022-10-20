package com.valtech.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valtech.account.entity.Account;
import com.valtech.account.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	private Account account;
	
	
	@Override
	public Account createAccount(Account acc){
		return accountRepository.save(acc);
	}
	
	
	@Override
	public Account updateAccount(Account acc){
		return accountRepository.save(acc);
	}
	
	@Override
	public Account getAccount(long id){
		return accountRepository.findById(id).get();
	}
	
	@Override
	public List<Account> getAllAccount(){
		return accountRepository.findAll();
	}


	@Override
	public Account createSavingAccount(double bal) {
		 
        account=new Account("SB",bal);
        return accountRepository.save(account);
	}


	@Override
	public Account createcurrentAccount(double bal) {
		 account=new Account("CA",bal);;
	        return accountRepository.save(account);
	}
}
