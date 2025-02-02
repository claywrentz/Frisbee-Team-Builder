package com.team.builder.frisbeeteambuilder.repository;

import com.team.builder.frisbeeteambuilder.model.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepo extends JpaRepository<Team, Integer> {

}
