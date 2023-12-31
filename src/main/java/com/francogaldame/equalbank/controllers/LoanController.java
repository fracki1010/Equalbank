package com.francogaldame.equalbank.controllers;

import com.francogaldame.equalbank.dtos.LoanApplicationDTO;
import com.francogaldame.equalbank.dtos.LoanDTO;
import com.francogaldame.equalbank.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Set;

@Transactional
@RestController
@RequestMapping("/api")
public class LoanController {

    @Autowired
    LoanService loanService;

    @GetMapping("/loans")
    public Set<LoanDTO> getLoans(){
        return loanService.getLoans();
    }

    @PostMapping("/loans")
    public ResponseEntity applyForLoan(@RequestBody LoanApplicationDTO loanApplicationDTO,
                                       Authentication authentication) {
    return loanService.applyForLoan(loanApplicationDTO, authentication);
    }

}
