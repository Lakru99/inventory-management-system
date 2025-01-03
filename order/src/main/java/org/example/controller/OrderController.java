package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Order;
import org.example.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/order")
@RequiredArgsConstructor
@CrossOrigin
public class OrderController {
    final OrderService orderService;
    @GetMapping("/get-all")
    public List<Order> getAll(){
        return orderService.getAll();
    }
    @GetMapping("/get-order/{orderId}")
    public Order getOrderById(@PathVariable Integer orderId){
        return orderService.getOrderById(orderId);
    }
    @PostMapping("/add-order")
    public void addOrder(@RequestBody Order order){
        orderService.addOrder(order);
    }
    @DeleteMapping("/delete-order/{id}")
    public void deleteOrderById(@PathVariable Integer id){
        orderService.deleteOrder(id);
    }
    @GetMapping("/search-order/{id}")
    public Order searchOrderById(@PathVariable Integer id){
        return orderService.searchOrder(id);
    }
    @PutMapping("/update-order")
    public void updateOrderById(@RequestBody Order order){
        orderService.updateOrder(order);
    }

}
