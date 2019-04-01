package com.example.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts() {
        List<Product> products = Arrays.asList(
                new Product(1, "Product 1", "Description 1", "URL of product 1"),
                new Product(2, "Product 2", "Description 2", "URL of product 2"),
                new Product(3, "Product 3", "Description 3", "URL of product 3")
        );
        return products;
    }

}
