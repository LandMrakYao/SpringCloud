package com.example.springclouddemoconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by Limengyao on 2020-06-04
 */
@FeignClient(name = "product-server",path = "/product")
@Component
public interface ProductService {
    @RequestMapping(value = "getProduct")
    String getProduct();
}