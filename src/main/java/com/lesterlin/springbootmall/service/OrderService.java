package com.lesterlin.springbootmall.service;

import com.lesterlin.springbootmall.dto.CreateOrderRequest;
import com.lesterlin.springbootmall.model.Order;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
