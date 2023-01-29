package com.expleomicroservices.order.command;


import com.expleomicroservices.order.coreapi.OrderRegistredEvent;
import com.expleomicroservices.order.coreapi.RegisterOrderCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

import java.util.List;

import static org.axonframework.modelling.command.AggregateLifecycle.apply;

@Aggregate
public class Order {
    @AggregateIdentifier
    private String orderId;
    private String userId;
    private List<String> products;
    private float price;

    @CommandHandler
    public Order(RegisterOrderCommand command) {
            apply(new OrderRegistredEvent(command.orderId(),
                    command.products(),
                    command.userId(),
                    command.price()));
    }


    @EventSourcingHandler
    public void on(OrderRegistredEvent event) {

    }




}
