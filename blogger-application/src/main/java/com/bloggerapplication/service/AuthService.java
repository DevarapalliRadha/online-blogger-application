package com.bloggerapplication.service;

import com.bloggerapplication.payload.LoginDto;
import com.bloggerapplication.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
