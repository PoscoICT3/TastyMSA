package com.example.shopListService.shop.service;

import com.example.shopListService.shop.model.ShopDto;
import com.example.shopListService.shop.repository.ShopPostMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ShopListServiceImpl implements ShopListService{
    @Autowired
    ShopPostMapper shopPostMapper;

    @Override
    public List<ShopDto> getShopGrade() {
        return shopPostMapper.getShopGrade();
    }
}
