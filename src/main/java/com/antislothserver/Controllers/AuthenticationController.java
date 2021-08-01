package com.antislothserver.Controllers;

import com.antislothserver.Models.User;
import com.antislothserver.Services.AuthService;
import com.antislothserver.Views.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

    @Autowired
    AuthService authService;

    @PostMapping("/register")
    public String registerUser(@RequestBody User user){
        return authService.registerUser(user);
    }

    @PostMapping("/login")
    public String showUser(@RequestBody LoginResponse loginResponse){
        return authService.login(loginResponse);
    }
}
