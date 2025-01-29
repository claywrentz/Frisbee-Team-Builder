package com.team.builder.frisbeeteambuilder.repository;

import com.team.builder.frisbeeteambuilder.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepo extends JpaRepository<Player, Integer> {

}
