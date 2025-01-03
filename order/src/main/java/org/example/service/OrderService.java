package org.example.service;

import org.example.dto.Order;

import java.util.List;

public interface OrderService {
    Order getOrderById(Integer orderId);
    List<Order> getAll();
    void addOrder(Order order);
    void deleteOrder(Integer id);
    Order searchOrder(Integer id);
    void updateOrder(Order order);
}
