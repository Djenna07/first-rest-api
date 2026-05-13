package com.djenna.firstrestapi.product.service;

import com.djenna.firstrestapi.product.api.request.ProductRequest;
import com.djenna.firstrestapi.product.api.response.ProductResponse;
import com.djenna.firstrestapi.product.domain.Product;
import com.djenna.firstrestapi.product.repository.ProductRepository;
import com.djenna.firstrestapi.product.support.ProductMapper;
import org.springframework.stereotype.Service;
import com.djenna.firstrestapi.product.support.exception.ProductNotFoundException;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public ProductResponse create(ProductRequest productRequest) {
        Product product = productMapper.toProduct(productRequest);
        product = productRepository.save(product);
        return productMapper.toProductResponse(product);
    }

    public List<ProductResponse> getAll() {
        return productRepository.findAll()
                .stream()
                .map(productMapper::toProductResponse)
                .toList();
    }

    public ProductResponse getById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException());

        return productMapper.toProductResponse(product);
    }

    public ProductResponse update(Long id, ProductRequest request) {

        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException());

        product.setName(request.getName());

        Product updatedProduct = productRepository.save(product);

        return productMapper.toProductResponse(updatedProduct);
    }

    public void delete(Long id) {

        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException());

        productRepository.delete(product);
    }
}