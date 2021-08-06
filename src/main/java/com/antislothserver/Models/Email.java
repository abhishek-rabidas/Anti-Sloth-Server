package com.antislothserver.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Document(collection = "email")
public class Email {
    private String email;
    private Date signupDate;
}
