package com.projet6.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projet6.Impl.User;
@RestController
@RequestMapping("/user")
public class userController {

    @GetMapping
    public ResponseEntity<User> getUser(){

        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        return  new ResponseEntity<User>(user, HttpStatus.OK);
    }
}
