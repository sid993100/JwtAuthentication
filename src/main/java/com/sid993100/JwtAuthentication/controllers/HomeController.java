package com.sid993100.JwtAuthentication.controllers;

import com.sid993100.JwtAuthentication.model.User;
import com.sid993100.JwtAuthentication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUser(){
        System.out.println("Getting users.");
        return userService.getUsers();
    }
}
