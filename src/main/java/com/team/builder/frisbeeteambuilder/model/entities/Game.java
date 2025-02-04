package com.team.builder.frisbeeteambuilder.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

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
    @ManyToOne
    @JoinColumn(name = "winning_team_id")
    private Team winningTeam;
    private Integer winningTeamPoints;
    @ManyToOne
    @JoinColumn(name = "losing_team_id")
    private Team losingTeam;
    private Integer losingTeamPoints;
    @ManyToMany
    @JoinTable(
            name = "game_team",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "team_id")
    )
    List<Team> gameTeams;

}
