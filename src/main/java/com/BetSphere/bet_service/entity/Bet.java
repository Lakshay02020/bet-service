package com.BetSphere.bet_service.entity;

import com.BetSphere.bet_service.constants.BetStatus;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bets")
public class Bet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private double amount;
    private double odds;

    @Enumerated(EnumType.STRING)
    private BetStatus status;
}

