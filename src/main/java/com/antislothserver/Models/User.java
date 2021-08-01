package com.antislothserver.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
}
