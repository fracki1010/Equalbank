package com.francogaldame.equalbank.services;

import com.francogaldame.equalbank.dtos.LoanApplicationDTO;
import com.francogaldame.equalbank.dtos.LoanDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;

import java.util.Set;


public interface LoanService {

    Set<LoanDTO> getLoans();

    ResponseEntity applyForLoan(LoanApplicationDTO loanApplicationDTO, Authentication authentication);

}
