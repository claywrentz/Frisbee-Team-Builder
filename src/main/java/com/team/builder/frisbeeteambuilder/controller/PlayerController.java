package com.team.builder.frisbeeteambuilder.controller;

import com.team.builder.frisbeeteambuilder.model.Player;
//import com.team.builder.frisbeeteambuilder.model.PlayerGameTeam;
import com.team.builder.frisbeeteambuilder.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @GetMapping("/players")
    public List<Player> getPlayer() {
        return playerService.getPlayers();
    }

    @PostMapping("/player")
    public void addPlayer(@RequestBody Player player) {
        playerService.save(player);
    }

//    @PostMapping("/playergameteam")
//    public void addPlayer(@RequestBody PlayerGameTeam playerGameTeam) {
//        System.out.println(playerGameTeam);
//        playerService.save(playerGameTeam);
//    }
}
