package com.francogaldame.equalbank.repositories;

import com.francogaldame.equalbank.models.Card;
import com.francogaldame.equalbank.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface CardRepository extends JpaRepository<Card, Long> {
    Boolean existsByNumber(String number);
    Boolean existsByCvv(String cvv);
    Client findByClient(String client);
}
