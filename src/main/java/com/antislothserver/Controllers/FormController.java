package com.antislothserver.Controllers;

import com.antislothserver.Models.Email;
import com.antislothserver.Services.EmailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/form")
@RestController
public class FormController {
    @Autowired
    EmailServices emailServices;

    @PostMapping("/save")
    public boolean saveEmail(@RequestBody Email requestBody){
        return emailServices.saveEmail(requestBody);
    }
}
