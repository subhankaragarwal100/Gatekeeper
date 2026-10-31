package com.solana.gatekeeper.management.controller;

import com.solana.gatekeeper.management.dto.responsedto.HealthResponse;
import com.solana.gatekeeper.management.service.HealthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/health")
@RequiredArgsConstructor
public class HealthController {

    private final HealthService healthService;

    @GetMapping
    public ResponseEntity<HealthResponse> health() {
        String dbStatus = healthService.getHealth();
        return ResponseEntity.ok(
                new HealthResponse("UP", dbStatus, LocalDateTime.now()));
    }
}
