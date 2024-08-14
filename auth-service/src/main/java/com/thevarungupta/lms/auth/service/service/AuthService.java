package com.thevarungupta.lms.auth.service.service;

import com.thevarungupta.lms.auth.service.entity.Role;
import com.thevarungupta.lms.auth.service.payload.LoginDTO;
import com.thevarungupta.lms.auth.service.payload.RegisterDTO;

import java.util.List;

public interface AuthService {
    String login(LoginDTO loginDto);
    String register(RegisterDTO registerDto);
    Role createRole(Role role);
    List<Role> getAllRole();
}
