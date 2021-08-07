package com.antislothserver.Services;

import com.antislothserver.Models.User;
import com.antislothserver.Repo.UserRepository;
import com.antislothserver.Views.ShowUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    @Autowired
    UserRepository userRepository;

    public ShowUserResponse getUser(String username){
        User user = userRepository.findByUsername(username);
        return new ShowUserResponse(user.getUid(), user.getFullname(), user.getUsername(), user.getEmail(), user.getSleepRecord());

    }

    public Boolean userValidation(String uid){
        if (userRepository.existsById(uid))
            return true;
        else return false;
    }
}
