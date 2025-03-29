package com.BetSphere.bet_service.service;

import com.BetSphere.bet_service.entity.Bet;

import java.util.List;

public interface BetService {
    public List<Bet> getBets(Long userId);
}
