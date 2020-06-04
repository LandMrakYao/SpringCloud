package com.example.springclouddemoproduct.controller;

import com.example.springclouddemoentity.entity.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by Limengyao on 2020-06-04
 */
@RestController
public class ProductController {
    @RequestMapping(value = "getProduct")
    public String getProduct(){
        Product product = new Product();
        return product.toString();
    }
}