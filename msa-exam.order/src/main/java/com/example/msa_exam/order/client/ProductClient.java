package com.example.msa_exam.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product", url = "http://product:19093") // docker-compose 기준
public interface ProductClient {
//    @GetMapping("/products/{productId}")
//    ProductResponseDto getProduct(@PathVariable Long productId);
}