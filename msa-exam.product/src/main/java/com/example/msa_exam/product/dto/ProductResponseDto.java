package com.example.msa_exam.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProductResponseDto {
    private Long productId;
    private String name;
    private Integer supplyPrice;
}