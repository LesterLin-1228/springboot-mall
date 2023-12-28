package com.lesterlin.springbootmall.service;

import com.lesterlin.springbootmall.constant.ProductCategory;
import com.lesterlin.springbootmall.dto.ProductRequest;
import com.lesterlin.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
