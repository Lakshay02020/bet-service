package com.BetSphere.bet_service.entity;

import com.BetSphere.bet_service.constants.BetStatus;
import com.BetSphere.bet_service.constants.SportName;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class SportBet{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private BigDecimal amount;
    private Double odds;

    @Enumerated(EnumType.STRING)
    private BetStatus status;
    private SportName sportName;
    //TODO Get Teams by match id
    private String teamA;
    private String teamB;
    private String predictedWinner;
}
