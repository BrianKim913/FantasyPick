package org.example.fantasypick.api.gateway.controller;

import lombok.RequiredArgsConstructor;
import org.example.fantasypick.api.gateway.dto.UserRegistrationDto;
import org.example.fantasypick.api.gateway.dto.UserResponseDto;
import org.example.fantasypick.core.usermanagement.application.service.UserApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    
    private final UserApplicationService userApplicationService;
    
    @PostMapping("/register")
    public ResponseEntity<Long> registerUser(@RequestBody UserRegistrationDto dto) {
        Long userId = userApplicationService.registerUser(dto.getEmail(), dto.getPassword(), dto.getNickname());
        return ResponseEntity.ok(userId);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto> getUser(@PathVariable Long id) {
        var user = userApplicationService.getUserById(id);
        UserResponseDto dto = new UserResponseDto(user.getId(), user.getEmail(), user.getNickname(), user.getBudget());
        return ResponseEntity.ok(dto);
    }
}