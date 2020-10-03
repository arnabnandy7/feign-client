package com.feign.feigndemo.controller;

import com.feign.feigndemo.feign.UserClient;
import com.feign.feigndemo.model.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserClient userClient;

// Rest call using feign client
    @GetMapping("/users")
    public List<UserResponse> getUserResponse(){
        return userClient.getUserResponse();
        
    }
}
