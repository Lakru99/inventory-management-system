package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.Order;
import org.example.entity.OrderEntity;
import org.example.repository.OrderRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{
    private final OrderRepository repository;
    private final ModelMapper modelMapper;
    @Override
    public Order getOrderById(Integer orderId) {
        Order order=repository.getOrderById(orderId);
        return modelMapper.map(order, Order.class);
    }
    @Override
    public List<Order> getAll() {
        List<Order> orderList =new ArrayList<>();
        repository.findAll().forEach(entity ->{
            orderList.add(modelMapper.map(entity, Order.class));
        });
        return orderList;
    }

    @Override
    public void addOrder(Order order) {
        repository.save(modelMapper.map(order, OrderEntity.class));
    }

    @Override
    public void deleteOrder(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Order searchOrder(Integer id) {
        return modelMapper.map(repository.findById(id), Order.class);
    }

    @Override
    public void updateOrder(Order order) {
        repository.save(modelMapper.map(order, OrderEntity.class));
    }
}
