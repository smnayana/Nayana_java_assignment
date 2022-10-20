package com.valtech.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.account.entity.Account;

@Repository
public interface AccountRepository  extends JpaRepository<Account, Long>{

	Account save(double balance);

}
