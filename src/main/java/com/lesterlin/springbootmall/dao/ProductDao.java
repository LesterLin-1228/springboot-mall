package com.lesterlin.springbootmall.dao;

import com.lesterlin.springbootmall.dto.ProductRequest;
import com.lesterlin.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
