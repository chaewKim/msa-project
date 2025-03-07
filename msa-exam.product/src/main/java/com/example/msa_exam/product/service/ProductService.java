package com.example.msa_exam.product.service;

import com.example.msa_exam.product.domain.entity.Product;
import com.example.msa_exam.product.domain.repository.ProductRepository;
import com.example.msa_exam.product.dto.ProductRequestDto;
import com.example.msa_exam.product.dto.ProductResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public void createProduct(ProductRequestDto request) {
        Product product = new Product();
        productRepository.save(product);
    }

    public List<ProductResponseDto> getProducts() {
        return productRepository.findAll().stream()
                .map(product -> new ProductResponseDto(product.getProductId(), product.getName(), product.getSupplyPrice()))
                .toList();
    }
}