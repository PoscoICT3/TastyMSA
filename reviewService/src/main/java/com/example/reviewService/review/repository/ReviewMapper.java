package com.example.reviewService.review.repository;


import com.example.reviewService.review.model.ReviewDto;
import com.example.reviewService.review.model.ReviewRateDto;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;


@Mapper
public interface ReviewMapper {
    Integer createReview(ReviewDto reviewDto);
    Integer countByUserId(Integer userId);

    List<ReviewRateDto> getShopRate();
}
