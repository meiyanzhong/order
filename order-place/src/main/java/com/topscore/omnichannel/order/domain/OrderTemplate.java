package com.topscore.omnichannel.order.domain;

import com.topscore.omnichannel.order.api.place.PlaceOrderController;
import com.topscore.omnichannel.order.data.OrderRepository;
import com.topscore.omnichannel.order.model.Order;
import com.topscore.omnichannel.order.model.OrderGoods;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderTemplate implements OrderOperations {

    @Autowired
    private OrderRepository orderRepository;
//    @Autowired
//    private OrderGoodsRepository orderGoodsRepository;

    @Transactional
    @Override
    public String create(final PlaceOrderController.OrderForm form) {
        final String orderId = generateId();

        Order order = new Order();
        order.setId(orderId);
        order.setType(Order.Type.valueOf(form.getType()));
        orderRepository.save(order);

        List<OrderGoods> goods = new ArrayList<>(form.getGoods().size());
//        form.getGoods().forEach(g -> {
//            OrderGoods gd = new OrderGoods();
//            OrderGoods.Id id = new OrderGoods.Id();
//            id.setOrderId(orderId);
//            id.setGoodsId(g.getId());
//            gd.setId(id);
//            gd.setQuality(g.getQuality());
//            gd.setUnitPrice(g.getUnitPrice());
//            goods.add(gd);
//        });
//        orderGoodsRepository.save(goods);

        return orderId;
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    private String generateId() {
        return "1000000000000001" + RandomUtils.nextInt(1000000, 9999999);
    }
}
