package com.francogaldame.equalbank.repositories;

import com.francogaldame.equalbank.models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
    boolean existsById(Long id);
}
