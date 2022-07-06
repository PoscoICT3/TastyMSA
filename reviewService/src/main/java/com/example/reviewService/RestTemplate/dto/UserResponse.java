package com.example.reviewService.RestTemplate.dto;

import lombok.Data;

@Data
public class UserResponse {
    private Integer id;
    private String userId;
    private String password;
    private String phoneNum;
    private String name;
}
