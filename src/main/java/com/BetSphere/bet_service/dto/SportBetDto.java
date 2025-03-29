package com.BetSphere.bet_service.dto;

import com.BetSphere.bet_service.constants.BetType;
import com.BetSphere.bet_service.constants.SportName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class SportBetDto {
    private BetType type;
    private BigDecimal amount;
    private LocalDateTime createdAt;
    private SportName sportName;
    private Double odds;

    //TODO Get Teams by match id
    private String teamA;
    private String teamB;
    private String predictedWinner;
}
