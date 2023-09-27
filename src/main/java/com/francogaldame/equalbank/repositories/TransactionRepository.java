package com.francogaldame.equalbank.repositories;

import com.mindhub.homebanking.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
