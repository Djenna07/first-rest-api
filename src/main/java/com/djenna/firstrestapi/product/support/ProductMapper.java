package com.djenna.firstrestapi.product.support;

import com.djenna.firstrestapi.product.api.request.ProductRequest;
import com.djenna.firstrestapi.product.api.response.ProductResponse;
import com.djenna.firstrestapi.product.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toProduct(ProductRequest productRequest) {
        return new Product(productRequest.getName());
    }

    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(product.getId(), product.getName());
    }
}