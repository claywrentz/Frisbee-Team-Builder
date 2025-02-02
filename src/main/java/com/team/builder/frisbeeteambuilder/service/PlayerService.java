package com.team.builder.frisbeeteambuilder.service;

import com.team.builder.frisbeeteambuilder.model.entities.Player;
import com.team.builder.frisbeeteambuilder.repository.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepo playerRepo;

    @Autowired
    PlayerService(final PlayerRepo playerRepo) {
        this.playerRepo = playerRepo;
    }

    public List<Player> getPlayers() {
        return playerRepo.findAll();
    }

    public void save(List<Player> players) {
        playerRepo.saveAll(players);
    }

    public void update(Integer pid, Player changePlayer) {
        Player oldPlayer = playerRepo.getReferenceById(pid);
        oldPlayer.setName(changePlayer.getName());
        oldPlayer.setSex(changePlayer.getSex());
        playerRepo.save(oldPlayer);
    }

    public void delete(Integer pid) {
        playerRepo.deleteById(pid);
    }
}
