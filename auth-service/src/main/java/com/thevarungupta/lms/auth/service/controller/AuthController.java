package com.thevarungupta.lms.auth.service.controller;

import com.thevarungupta.lms.auth.service.entity.Role;
import com.thevarungupta.lms.auth.service.payload.LoginDTO;
import com.thevarungupta.lms.auth.service.payload.RegisterDTO;
import com.thevarungupta.lms.auth.service.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/auth")
@RestController
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterDTO registerDto){
        String response = authService.register(registerDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDTO loginDto){
        String response = authService.login(loginDto);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/roles")
    public ResponseEntity<Role> createRole(@RequestBody Role role){
        Role response = authService.createRole(role);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/roles")
    public ResponseEntity<List<Role>> getAllRole(){
        List<Role> response = authService.getAllRole();
        return ResponseEntity.ok(response);
    }
}
