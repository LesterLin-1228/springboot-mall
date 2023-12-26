package com.lesterlin.springbootmall.dao;

import com.lesterlin.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
