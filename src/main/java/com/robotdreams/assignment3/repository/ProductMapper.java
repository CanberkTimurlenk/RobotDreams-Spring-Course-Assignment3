package com.robotdreams.assignment3.repository;

import com.robotdreams.assignment3.dto.ProductResponseDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper
        implements RowMapper<ProductResponseDto> {

    @Override
    public ProductResponseDto mapRow(ResultSet rs, int rowNum) throws SQLException {

        ProductResponseDto productResponseDto = new ProductResponseDto();

        productResponseDto.setName(rs.getString("Name"));
        productResponseDto.setCategory(rs.getString("Category"));
        productResponseDto.setPhotoUrl(rs.getString("Photo_Url"));
        productResponseDto.setDescription(rs.getString("Description"));
        productResponseDto.setPrice(rs.getDouble("Price"));

        return productResponseDto;
    }
}
