package com.example.microservices.order.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private Long customerId;
    private String firstName;
    private String lastName;
    private String adress;
}