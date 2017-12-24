package com.topscore.omnichannel.order.api.place;

import com.topscore.omnichannel.order.data.OrderRepository;
import com.topscore.omnichannel.order.domain.OrderTemplate;
import com.topscore.omnichannel.order.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceOrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderTemplate orderTemplate;

    public List<Order> listOrders() {
        return orderRepository.findAll();
    }

    public Order getOrders(String orderId) {
        return orderRepository.findOne(orderId);
    }

    public String createOrder(PlaceOrderController.OrderForm form) {
        return orderTemplate.create(form);
    }
}
