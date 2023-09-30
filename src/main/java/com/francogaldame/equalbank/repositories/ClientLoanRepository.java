package com.francogaldame.equalbank.repositories;

import com.francogaldame.equalbank.models.ClientLoan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientLoanRepository extends JpaRepository<ClientLoan, Long> {
}
