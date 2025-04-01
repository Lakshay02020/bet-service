package com.BetSphere.bet_service.repository;

import com.BetSphere.bet_service.entity.SportBet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportBetRepository extends JpaRepository<SportBet, Long> {
}
