package com.youcode.Aftas.entity;


import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class RankingId implements Serializable {

    private int competitionId;
    private int memberId;
}
