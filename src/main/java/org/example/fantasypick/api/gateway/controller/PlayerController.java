package org.example.fantasypick.api.gateway.controller;

import lombok.RequiredArgsConstructor;
import org.example.fantasypick.core.playermanagement.application.service.PlayerApplicationService;
import org.example.fantasypick.core.playermanagement.domain.entity.Player;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/players")
@RequiredArgsConstructor
public class PlayerController {
    
    private final PlayerApplicationService playerApplicationService;
    
    @GetMapping("/team/{team}")
    public ResponseEntity<List<Player>> getPlayersByTeam(@PathVariable String team) {
        List<Player> players = playerApplicationService.getPlayersByTeam(team);
        return ResponseEntity.ok(players);
    }
    
    @GetMapping("/position/{position}")
    public ResponseEntity<List<Player>> getPlayersByPosition(@PathVariable String position) {
        List<Player> players = playerApplicationService.getPlayersByPosition(position);
        return ResponseEntity.ok(players);
    }
    
    @PostMapping
    public ResponseEntity<Void> createPlayer(@RequestBody Player player) {
        playerApplicationService.createPlayer(player);
        return ResponseEntity.ok().build();
    }
}