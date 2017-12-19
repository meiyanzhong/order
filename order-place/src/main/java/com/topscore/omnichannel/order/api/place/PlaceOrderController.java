package com.topscore.omnichannel.order.api.place;

import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class PlaceOrderController {

    @GetMapping
    public String list() {

        return "";
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



    @Data
    public static class OrderForm {
        private String id;
        private String type;
        private List<GoodsForm> goods;
    }

    @Data
    public static class GoodsForm {
        private String id;
        private int quality;
    }
}
