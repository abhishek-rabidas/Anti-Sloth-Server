package com.antislothserver.Services;

import com.antislothserver.Models.User;
import com.antislothserver.Repo.UserRepository;
import com.antislothserver.Views.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public String registerUser(User user){
        user.setUid(UUID.randomUUID().toString());
        userRepository.save(user);
        return "Registered";
    }

    public String login(LoginResponse loginResponse){
        User user = userRepository.findByUsername(loginResponse.getUsername());
        if(loginResponse.getPassword().equals(user.getPassword()))
            return user.getUid();
        else
            return "false";
    }
}
