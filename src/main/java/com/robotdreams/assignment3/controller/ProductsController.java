package com.robotdreams.assignment3.controller;

import com.robotdreams.assignment3.dto.ProductResponseDto;
import com.robotdreams.assignment3.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/products")
public class ProductsController {

    private final ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductResponseDto> getProducts(@RequestParam Optional<String> categoryName) {
        return productService.getProductsByCategory(categoryName);
    }


}
