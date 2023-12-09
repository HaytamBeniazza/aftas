package com.youcode.Aftas.entity;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ranking implements Serializable {
    @EmbeddedId
    private RankingId id;
    private int rank;
    private int score;
    @ManyToOne
    private Member member;
    @ManyToOne
    private Competition competition;
}
