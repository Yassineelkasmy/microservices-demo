package com.expleomicroservices.order.query;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Order {

    @Id
    private String orderId;
    private String userId;
    private float price;

}
