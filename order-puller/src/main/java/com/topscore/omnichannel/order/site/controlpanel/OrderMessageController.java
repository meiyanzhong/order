package com.topscore.omnichannel.order.site.controlpanel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order-messages")
public class OrderMessageController {

    @Autowired
    private OrderMessageRepository repository;

    @GetMapping
    public List<OrderMessage> list(@PageableDefault(value = 20, sort = "createdDate", direction = Sort.Direction.DESC) Pageable pageable) {
        return repository.findAll();
//        return repository.findAll(pageable).getContent();
    }

    @GetMapping("/{id}")
    public OrderMessage ordermessage(@PathVariable("id") String id) {
        return repository.findOne(id);
    }
}
