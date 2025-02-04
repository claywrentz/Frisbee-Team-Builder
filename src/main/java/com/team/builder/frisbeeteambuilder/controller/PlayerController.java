package com.team.builder.frisbeeteambuilder.controller;

import com.team.builder.frisbeeteambuilder.model.entities.Player;
import com.team.builder.frisbeeteambuilder.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    PlayerController(final PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/players")
    public List<Player> getPlayers() {
        return playerService.getPlayers();
    }

    @PostMapping("/players")
    public void addPlayers(@RequestBody List<Player> players) { playerService.save(players); }

    @PutMapping("/player/{pid}")
    public void updatePlayer(@PathVariable Integer pid, @RequestBody Player player) {
        //need to enforce not being able to post
        playerService.update(pid, player);
    }

    @DeleteMapping("/player/{pid}")
    public void deletePlayer(@PathVariable Integer pid) {
        playerService.delete(pid);
    }

}
