package com.antislothserver.Services;

import com.antislothserver.Models.Email;
import com.antislothserver.Repo.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class EmailServices {
    @Autowired
    EmailRepository emailRepository;
    public boolean saveEmail(Email body){
        body.setSignupDate(new Date());
        emailRepository.save(body);
        return true;
    }
}
