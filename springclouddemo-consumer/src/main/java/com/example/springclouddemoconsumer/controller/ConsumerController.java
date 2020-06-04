package com.example.springclouddemoconsumer.controller;

import com.example.springclouddemoconsumer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by Limengyao on 2020-06-04
 */
@RestController
public class ConsumerController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "getConsumer")
    public String getConsumer(){
        String str = productService.getProduct();
        return str;
    }

}