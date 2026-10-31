package com.solana.gatekeeper.management.controller;

import com.solana.gatekeeper.management.dto.requestDto.LoginRequest;
import com.solana.gatekeeper.management.dto.responsedto.LoginResponse;
import com.solana.gatekeeper.management.service.AuthenticationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login (@Valid @RequestBody LoginRequest request){
        return ResponseEntity.ok(authenticationService.login(request));
    }
}
