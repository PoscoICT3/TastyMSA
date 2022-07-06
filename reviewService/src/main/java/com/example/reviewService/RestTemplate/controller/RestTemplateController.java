package com.example.reviewService.RestTemplate.controller;

import com.example.reviewService.RestTemplate.dto.UserResponse;
import com.example.reviewService.RestTemplate.service.RestTemplateService;
import org.bouncycastle.cert.ocsp.Req;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resttemplate")
public class RestTemplateController {
    @Autowired
    RestTemplateService restTemplateService;

    public RestTemplateController(RestTemplateService restTemplateService){
        this.restTemplateService = restTemplateService;
    }

    @GetMapping("/req")
    public UserResponse userResponse() {
        return restTemplateService.hello();

    }



}
