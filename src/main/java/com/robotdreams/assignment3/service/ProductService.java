package com.robotdreams.assignment3.service;

import com.robotdreams.assignment3.dto.ProductResponseDto;
import com.robotdreams.assignment3.repository.ProductMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final JdbcTemplate jdbcTemplate;

    public ProductService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<ProductResponseDto> getProductsByCategory(Optional<String> categoryName) {

        List<ProductResponseDto> query;

        if (categoryName.isEmpty())
            query = jdbcTemplate.query("SELECT * FROM Products", new ProductMapper());

        else
            // write a query to fetch products by category from the db
            query = jdbcTemplate.query("SELECT * FROM Products WHERE Category = ?"
                    , new Object[]{categoryName.get()}, new ProductMapper());


        return query;
    }
}