package com.BetSphere.bet_service.service.impl;

import com.BetSphere.bet_service.dto.SportBetDto;
import com.BetSphere.bet_service.entity.SportBet;
import com.BetSphere.bet_service.repository.SportBetRepository;
import com.BetSphere.bet_service.service.BetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BetServiceImpl implements BetService {
    @Autowired
    SportBetRepository sportRepository;

    @Override
    public List<SportBetDto> getBets(Long userId) {
        return null;
    }

    @Override
    public SportBetDto addSportsBet(SportBetDto sportsBetDto) {
        SportBet sportBet = new SportBet();
        sportBet.setAmount(sportsBetDto.getAmount());
        sportBet.setOdds(sportsBetDto.getOdds());
        sportRepository.save(sportBet);
        return sportsBetDto;
    }

}
