package com.lesterlin.springbootmall.service.impl;

import com.lesterlin.springbootmall.dao.ProductDao;
import com.lesterlin.springbootmall.model.Product;
import com.lesterlin.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
