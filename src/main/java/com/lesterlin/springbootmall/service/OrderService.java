package com.lesterlin.springbootmall.service;

import com.lesterlin.springbootmall.dto.CreateOrderRequest;
import com.lesterlin.springbootmall.dto.OrderQueryParams;
import com.lesterlin.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer countOrders(OrderQueryParams orderQueryParams);
}
