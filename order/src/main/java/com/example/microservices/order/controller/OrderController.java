package com.example.microservices.order.controller;

import com.example.microservices.order.VO.ResponseTemplateVO;
import com.example.microservices.order.entity.Order;
import com.example.microservices.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/")
    public Order saveCustomer(@RequestBody Order order){
        log.info("save order start OrderController");
        return orderService.saveOrder(order);
    }

    @GetMapping("/{id}")
    public Order findOrderById(@PathVariable("id") Long orderId){
        log.info("findOrderById start OrderController");
        return orderService.findOrderById(orderId);
    }
/*
    @GetMapping("/withCustomer/{id}")
    public ResponseTemplateVO getOrderWithCustomer(@PathVariable("id") Long orderId){
        log.info("findOrderWithCustomer start OrderController");
        return orderService.getOrderWithCustomer(orderId);
    }
*/
}
