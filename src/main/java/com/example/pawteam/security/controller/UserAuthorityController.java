package com.example.pawteam.security.controller;

import com.example.pawteam.model.security.UserAuthority;
import com.example.pawteam.security.repository.UserAuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/authUser")
public class UserAuthorityController {

    @Autowired
    private UserAuthorityRepository userAuthorityRepository;

    @GetMapping
    public Iterable<UserAuthority> getAllAuth(){
        return userAuthorityRepository.findAll();
    }
}
