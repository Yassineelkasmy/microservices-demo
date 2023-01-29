package com.expleomicroservices.order.coreapi;

import org.axonframework.modelling.command.TargetAggregateIdentifier;
import org.springframework.stereotype.Component;

import java.util.List;



@Component
public record RegisterOrderCommand(@TargetAggregateIdentifier String orderId, List<String> products,String userId, float price){}
