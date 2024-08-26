package com.sid993100.JwtAuthentication.services;

import com.sid993100.JwtAuthentication.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(), "Siddharth Pathak", "sid99310@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Siddharth", "sid9931@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Siddharth Ji", "sid993100@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Siddharth Pathak Ji", "sid993@gmail.com"));

    }

    public List<User> getUsers(){
        return this.store;
    }

}
