package org.example.repository;

import org.example.dto.Order;
import org.example.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
    @Query(value = "SELECT * FROM order WHERE id=?1", nativeQuery = true)
    Order getOrderById(Integer orderId);
}
