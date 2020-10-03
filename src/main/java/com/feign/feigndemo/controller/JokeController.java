package com.feign.feigndemo.controller;

import com.feign.feigndemo.feign.JokeClient;
import com.feign.feigndemo.feign.UserClient;
import com.feign.feigndemo.model.JokeResponse;
import com.feign.feigndemo.model.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JokeController {
    @Autowired
    private JokeClient jokeClient;

    @Value("${apiHost}")
    private String apiHost;

    @Value("${apiKey}")
    private String apiKey;

// Rest call using feign client
    @GetMapping("/joke")
    public JokeResponse getJoke(@RequestHeader(value = "x-rapidapi-host") String xRapidApiHost, @RequestHeader(value="x-rapidapi-key") String xRapidApiKey){
        return jokeClient.getJoke(xRapidApiHost,xRapidApiKey);
        
    }
}
