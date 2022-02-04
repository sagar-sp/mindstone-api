package com.mindstone.mindstoneapi.Controller;

import javax.validation.Valid;

import com.mindstone.mindstoneapi.Entity.Userentity;
import com.mindstone.mindstoneapi.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AuthorizationController {
    @Autowired
    private UserRepository repo;

    @PostMapping("/signup")
    public Userentity SignUp(@Valid @RequestBody Userentity data) {
        return repo.save(data);
    }
}
