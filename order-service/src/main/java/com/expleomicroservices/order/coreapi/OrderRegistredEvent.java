package com.expleomicroservices.order.coreapi;


import java.util.List;

public record OrderRegistredEvent(String orderId, List<String> products,String userId ,float price) {
}