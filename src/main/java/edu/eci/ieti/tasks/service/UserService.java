package edu.eci.ieti.tasks.service;

import java.util.List;

import edu.eci.ieti.tasks.entities.User;

public interface UserService {

    
    User create( User user );

    User findById( String id );
     
    List<User> getAll();

    void deleteById( String id );

    User update( User user, String userId );


}
