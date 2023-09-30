package com.francogaldame.equalbank.services;

import com.francogaldame.equalbank.models.CardColor;
import com.francogaldame.equalbank.models.CardType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;

public interface CardService {


    ResponseEntity<Object> createdCard(CardType cardType, CardColor cardColor,
                                       Authentication authentication);

}