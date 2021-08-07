package com.antislothserver.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection = "Users")
public class User {
    @Id
    private String uid;
    private String fullname;
    private String username;
    private String email;
    private String password;
    private List<SleepRecord> sleepRecord;
}
