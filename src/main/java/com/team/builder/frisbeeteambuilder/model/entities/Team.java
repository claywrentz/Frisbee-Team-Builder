package com.team.builder.frisbeeteambuilder.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Team {

    //do some hashing here to get teamID based on the set of players in it, only one team per unique set of players
    @Id
    private Integer teamID;
    @ManyToMany(mappedBy = "gameTeams")
    List<Game> games;
    @ManyToMany(mappedBy = "playerTeams")
    List<Player> players;

}
