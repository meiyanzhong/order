package com.topscore.omnichannel.order;

import com.topscore.omnichannel.order.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsMapper mapper;

    @GetMapping
    @ResponseBody
    public Goods index() {
        return mapper.findOne("10001");
    }
}
