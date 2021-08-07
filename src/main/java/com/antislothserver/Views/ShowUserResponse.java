package com.antislothserver.Views;

import com.antislothserver.Models.SleepRecord;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ShowUserResponse {
    private String uid;
    private String fullname;
    private String username;
    private String email;
    private List<SleepRecord> sleepRecord;

    public ShowUserResponse(String uid, String fullname, String username, String email, List<SleepRecord> sleepRecord) {
        this.uid = uid;
        this.fullname = fullname;
        this.username = username;
        this.email = email;
        this.sleepRecord = sleepRecord;
    }
}
