package com.antislothserver.Repo;

import com.antislothserver.Models.Email;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmailRepository extends MongoRepository<Email, String> {
}
