package com.BetSphere.bet_service.service.impl;

import com.BetSphere.bet_service.entity.Bet;
import com.BetSphere.bet_service.service.BetService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BetServiceImpl implements BetService {

    @Override
    public List<Bet> getBets(Long userId) {
        return null;
    }

}
