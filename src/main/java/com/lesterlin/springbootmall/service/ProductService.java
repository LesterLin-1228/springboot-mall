package com.lesterlin.springbootmall.service;

import com.lesterlin.springbootmall.dto.ProductRequest;
import com.lesterlin.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
