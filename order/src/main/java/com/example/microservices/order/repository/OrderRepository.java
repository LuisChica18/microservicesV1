package com.example.microservices.order.repository;

import com.example.microservices.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    Order findByOrderId(Long orderId);
}
