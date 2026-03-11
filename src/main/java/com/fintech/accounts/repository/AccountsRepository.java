package com.fintech.accounts.repository;

import com.fintech.accounts.entity.Accounts;
import com.fintech.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
}
