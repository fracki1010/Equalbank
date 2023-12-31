package com.francogaldame.equalbank.controllers;

import com.francogaldame.equalbank.dtos.AccountDTO;
import com.francogaldame.equalbank.models.Client;
import com.francogaldame.equalbank.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api")
public class AccountController {
    @Autowired
    private AccountService accountService;


    @GetMapping("/accounts")
    public List<AccountDTO> getAccount(){
        return accountService.getAccount();
    }

    @GetMapping("/accounts/{id}")
    public AccountDTO getAccountById(@PathVariable Long id){
        return accountService.getAccountById(id);
    }

    @GetMapping("/clients/current/accounts")
    public List<AccountDTO> getAccountsCurrent(Authentication authentication){
        return accountService.getAccountsCurrent(authentication);
    }

    @PostMapping("/clients/current/accounts")
    public ResponseEntity<Object> createdAccount(Authentication authentication){
        return accountService.createdAccount(authentication);
    }


    //Identificacion del cliente
    public Client getCurrentClient(Authentication authentication){
        return accountService.getCurrentClient(authentication);
    }
}
