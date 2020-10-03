package com.feign.feigndemo.feign;

import com.feign.feigndemo.model.JokeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(url = "https://joke3.p.rapidapi.com/v1",name = "JOKE-CLIENT")
public interface JokeClient {
    
    @GetMapping(value="/joke")
    public JokeResponse getJoke(@RequestHeader(value = "x-rapidapi-host") String xRapidApiHost,
                                @RequestHeader(value="x-rapidapi-key") String xRapidApiKey);

    
}
