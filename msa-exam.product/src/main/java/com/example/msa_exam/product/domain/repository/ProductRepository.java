package com.example.msa_exam.product.domain.repository;

import com.example.msa_exam.product.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}