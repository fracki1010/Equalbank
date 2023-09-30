package com.francogaldame.equalbank.services;

import com.francogaldame.equalbank.dtos.AccountDTO;
import com.francogaldame.equalbank.models.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;

import java.util.List;

public interface AccountService {
    List<AccountDTO> getAccount();

    AccountDTO getAccountById(Long id);

    List<AccountDTO> getAccountsCurrent(Authentication authentication);

    ResponseEntity<Object> createdAccount(Authentication authentication);

    Client getCurrentClient(Authentication authentication);
}
