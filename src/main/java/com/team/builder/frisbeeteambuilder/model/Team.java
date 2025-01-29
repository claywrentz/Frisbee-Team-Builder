package com.team.builder.frisbeeteambuilder.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Team {

    //do some hashing here to get teamID based on the set of players in it, only one team per unique set of players
    @Id
    private Integer teamID;

}
