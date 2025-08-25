package org.example.fantasypick.api.gateway.controller;

import lombok.RequiredArgsConstructor;
import org.example.fantasypick.core.rostermanagement.application.service.RosterApplicationService;
import org.example.fantasypick.core.rostermanagement.domain.entity.Roster;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rosters")
@RequiredArgsConstructor
public class RosterController {
    
    private final RosterApplicationService rosterApplicationService;
    
    @PostMapping
    public ResponseEntity<Long> createRoster(@RequestParam Long userId, @RequestParam String name) {
        Long rosterId = rosterApplicationService.createRoster(userId, name);
        return ResponseEntity.ok(rosterId);
    }
    
    @GetMapping("/user/{userId}")
    public ResponseEntity<Roster> getRosterByUserId(@PathVariable Long userId) {
        Roster roster = rosterApplicationService.getRosterByUserId(userId);
        return ResponseEntity.ok(roster);
    }
    
    @PutMapping("/{rosterId}/players")
    public ResponseEntity<Void> addPlayerToRoster(@PathVariable Long rosterId, @RequestParam Long playerId) {
        rosterApplicationService.addPlayerToRoster(rosterId, playerId);
        return ResponseEntity.ok().build();
    }
}