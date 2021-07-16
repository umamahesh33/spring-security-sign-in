package com.example.springsecuritysignin.controllers;

import com.example.springsecuritysignin.requestPOJO.userRequest;
import com.example.springsecuritysignin.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class applicationControllers{

    @Autowired
    userService userService;

    @GetMapping("/afterLogin")
    public String afterLogin() {
        return "only authenticated users only see this page..!";
    }

    @GetMapping("/home")
    public String greetUser() {
        return "<h1>welcome to signIn application</h1>";
    }

    @PostMapping("/user/create")
    public String createUser(@RequestBody userRequest userRequest) throws Exception {
        try {
            userService.createUser(userRequest);
            return "User Created Successfully";
        } catch (Exception e) {
            throw new Exception("an error occurred while creating user");
        }
    }
}
