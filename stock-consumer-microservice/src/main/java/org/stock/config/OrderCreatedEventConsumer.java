package org.stock.config;

import org.stock.model.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component
public class OrderCreatedEventConsumer {

    @KafkaListener(topics = "order-created-event", groupId = "stock-group", properties = {"spring.json.value.default.type=org.stock.model.Order"})
    public void consumeOrderCreatedEvent(Order order, Acknowledgment acknowledgment) {
        System.out.printf("Stock Group, Order ID: %s%n", order.getOrderId());
        acknowledgment.acknowledge();
    }

}