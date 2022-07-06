package com.example.reviewService.review.service;


import com.example.reviewService.review.model.ReviewDto;
import com.example.reviewService.review.model.ReviewRateDto;

import java.util.List;

public interface reviewService {
    Boolean createReview(ReviewDto reviewDto);
    Integer countReview(Integer userId);

    List<ReviewRateDto> getShopRate();
}
