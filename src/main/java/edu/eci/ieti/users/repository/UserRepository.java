package edu.eci.ieti.users.repository;

import edu.eci.ieti.users.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>
{}