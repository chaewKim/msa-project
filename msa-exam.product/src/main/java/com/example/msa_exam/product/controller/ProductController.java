package com.example.msa_exam.product.controller;

import com.example.msa_exam.product.dto.ProductRequestDto;
import com.example.msa_exam.product.dto.ProductResponseDto;
import com.example.msa_exam.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<Void> createProduct(@RequestBody ProductRequestDto request) {
        productService.createProduct(request);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public List<ProductResponseDto> getProducts() {
        return productService.getProducts();
    }
}