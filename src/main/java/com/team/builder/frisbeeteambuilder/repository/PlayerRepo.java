package com.team.builder.frisbeeteambuilder.repository;

import com.team.builder.frisbeeteambuilder.model.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepo extends JpaRepository<Player, Integer> {

}
