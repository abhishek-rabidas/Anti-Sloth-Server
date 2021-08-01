package com.antislothserver.Controllers;

import com.antislothserver.Models.User;
import com.antislothserver.Services.UserServices;
import com.antislothserver.Views.ValidationRequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserServices userServices;

    @GetMapping("/show/{username}")
    public User showUser(@PathVariable String username){
        return userServices.getUser(username);
    }

    @PostMapping("/validate")
    public Boolean userValidate(@RequestBody ValidationRequestBody body){
        return userServices.userValidation(body.getUid());
    }
}
