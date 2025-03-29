package com.BetSphere.bet_service.service;

import com.BetSphere.bet_service.dto.SportBetDto;

import java.util.List;

public interface BetService {
    public List<SportBetDto> getBets(Long userId);
    public SportBetDto addSportsBet(SportBetDto sportsBetDto);
}
