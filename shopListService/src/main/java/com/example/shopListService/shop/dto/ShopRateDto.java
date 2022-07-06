package com.example.shopListService.shop.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ShopRateDto {
    private Integer id;
    private String name;
    private String location;
    private String image;
    private double grade;

}
