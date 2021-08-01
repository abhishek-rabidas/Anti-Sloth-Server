package com.antislothserver.Controllers;

import com.antislothserver.Models.SleepRecord;
import com.antislothserver.Services.AuthService;
import com.antislothserver.Services.SleepAPIServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sleep")
public class SleepRecording {

    @Autowired
    SleepAPIServices sleepAPIServices;

    @PostMapping("/record/{username}")
    public String recordSleep(@PathVariable String username, @RequestBody SleepRecord sleepRecord){
        sleepAPIServices.recordSleep(username, sleepRecord);
        return "Saved";
    }
}
