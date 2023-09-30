package com.francogaldame.equalbank.repositories;

import com.francogaldame.equalbank.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
