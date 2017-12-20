package com.topscore.omnichannel.order.api.place;

import com.topscore.omnichannel.order.data.OrderRepository;
import com.topscore.omnichannel.order.model.Orders;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class PlaceOrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public List<Orders> list() {
        return orderRepository.findAll();
    }

    @GetMapping("/{id}")
    public String one(@PathVariable("id") String orderId) {
        return "";
    }

    @PostMapping
    public String create(@RequestBody OrderForm form) {
        return "";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id) {
        return "";
    }

    /**
     * 订单表单。
     */
    @Data
    public static class OrderForm {
        private String id;
        private String type;
        private List<GoodsForm> goods;
    }

    /**
     * 商品表单。
     */
    @Data
    public static class GoodsForm {
        private String id;
        private int quality;
    }
}
