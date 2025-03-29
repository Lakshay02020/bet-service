package com.BetSphere.bet_service.controller;

import com.BetSphere.bet_service.entity.Bet;
import com.BetSphere.bet_service.service.BetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class BetController {
    @Autowired
    private BetService betService;

    @GetMapping
    public List<Bet> getAllBets(@RequestParam Long userId){
        List<Bet> bets = betService.getBets(userId);
        return null;
    }

}
