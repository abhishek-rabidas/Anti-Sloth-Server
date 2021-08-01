package com.antislothserver.Services;

import com.antislothserver.Models.User;
import com.antislothserver.Repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    @Autowired
    UserRepository userRepository;

    public User getUser(String username){
        return userRepository.findByUsername(username);
    }

    public Boolean userValidation(String uid){
        if (userRepository.existsById(uid))
            return true;
        else return false;
    }
}
