package com.team.builder.frisbeeteambuilder.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gameID;
    private Date date;
    private Integer field;
    private Integer winningTeamID;
    private Integer winningTeamPoints;
    private Integer losingTeamID;
    private Integer losingTeamPoints;

}
