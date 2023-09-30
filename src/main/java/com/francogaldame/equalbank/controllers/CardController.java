package com.francogaldame.equalbank.controllers;


import com.francogaldame.equalbank.models.CardColor;
import com.francogaldame.equalbank.models.CardType;
import com.francogaldame.equalbank.services.CardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CardController {

    @Autowired
    private CardService cardService;


    @PostMapping("/clients/current/cards")
    public ResponseEntity<Object> createdCard(
            @RequestParam CardType cardType, @RequestParam CardColor cardColor,
            Authentication authentication){
        return cardService.createdCard(cardType, cardColor, authentication);
    }

}