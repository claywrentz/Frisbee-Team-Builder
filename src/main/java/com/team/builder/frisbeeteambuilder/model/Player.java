package com.team.builder.frisbeeteambuilder.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer playerID;
    private String name;
    private String sex;
    @ManyToMany
    private List<Game> games;
    @ManyToMany
    private List<Team> teams;

}
