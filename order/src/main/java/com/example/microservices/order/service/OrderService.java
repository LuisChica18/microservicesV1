package com.example.microservices.order.service;

import com.example.microservices.order.VO.Customer;
import com.example.microservices.order.VO.ResponseTemplateVO;
import com.example.microservices.order.entity.Order;
import com.example.microservices.order.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class OrderService {

    @Autowired
    OrderRepository orderRepository;
/*
    @Autowired
    RestTemplate restTemplate;
*/
    public Order saveOrder(Order order) {
        log.info("save order start OrderService");
        return orderRepository.save(order);
    }

    public Order findOrderById(Long orderId) {
        log.info("findOrderById start OrderService");
        return orderRepository.findByOrderId(orderId);
    }
/*
    public ResponseTemplateVO getOrderWithCustomer(Long orderId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Order order=orderRepository.findByOrderId(orderId);
        Customer customer=restTemplate.getForObject("http://CUSTOMER-SERVICE/customer/"+order.getCustomerId(), Customer.class);
        vo.setCustomer(customer);
        vo.setOrder(order);
        return vo;
    }
 */
}
