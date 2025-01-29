package com.team.builder.frisbeeteambuilder.service;

import com.team.builder.frisbeeteambuilder.model.Player;
//import com.team.builder.frisbeeteambuilder.model.PlayerGameTeam;
//import com.team.builder.frisbeeteambuilder.repository.PlayerGameTeamRepo;
import com.team.builder.frisbeeteambuilder.repository.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PlayerService {

    @Autowired
    PlayerRepo playerRepo;

    List<Player> players = new ArrayList<>(Arrays.asList(new Player(), new Player()));
    @Autowired
//    private PlayerGameTeamRepo playerGameTeamRepo;

    public List<Player> getPlayers() {
        return players;
    }

    public void save(Player player) {
        playerRepo.save(player);
    }

//    public void save(PlayerGameTeam playerGameTeam) {
//        playerGameTeamRepo.save(playerGameTeam);
//    }
}
