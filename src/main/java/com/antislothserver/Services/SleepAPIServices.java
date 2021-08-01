package com.antislothserver.Services;

import com.antislothserver.Models.SleepRecord;
import com.antislothserver.Models.User;
import com.antislothserver.Repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SleepAPIServices {

    @Autowired
    UserRepository userRepository;

    public void recordSleep(String username, SleepRecord sleepRecord){
        User user = userRepository.findByUsername(username);
        if(user.getSleepRecord() == null){
            List<SleepRecord> sleepRecordList = new ArrayList<>();
            sleepRecordList.add(sleepRecord);
            user.setSleepRecord(sleepRecordList);
        }else{
            user.getSleepRecord().add(sleepRecord);
        }
        userRepository.save(user);
    }
}
