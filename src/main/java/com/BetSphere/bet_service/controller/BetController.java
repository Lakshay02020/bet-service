package com.BetSphere.bet_service.controller;

import com.BetSphere.bet_service.dto.SportBetDto;
import com.BetSphere.bet_service.service.BetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class BetController {
    @Autowired
    private BetService betService;

    @GetMapping
    public List<SportBetDto> getBetsByUserId(@RequestParam Long userId){
        List<SportBetDto> bets = betService.getBets(userId);
        return null;
    }

    @PostMapping("sportsBet/add/")
    public SportBetDto addSportsBet(@RequestBody SportBetDto sportsBetDto){
        return betService.addSportsBet(sportsBetDto);
    }

}
