package com.djenna.firstrestapi.product.repository;

import com.djenna.firstrestapi.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}